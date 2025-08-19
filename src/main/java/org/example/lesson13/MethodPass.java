package org.example.lesson13;

/**
 * В наследовании Java из представленных пунктов доступны:
 * 1. метод публичен в родительском классе А и публичен в его потомке B;
 * 3. метод скрыт в родительском классе А и публичен в его потомке B;
 * 4. метод скрыт в родительском классе А и скрыт в его потомке B.
 */
public class MethodPass {

    public void publicMethod() {
        System.out.println("publicMethod");
    }

    protected void protectedMethodForPublic() {
        System.out.println("protectedMethodForPublic");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }
}

class Child extends MethodPass {

    // 1. Метод публичен в родительском классе А и публичен в его потомке B;
    @Override
    public void publicMethod() {
        super.publicMethod();
    }

    // 3. Метод скрыт в родительском классе А и публичен в его потомке B;
    @Override
    public void protectedMethodForPublic() {
        super.protectedMethodForPublic();
    }

    // 4. Метод скрыт в родительском классе А и скрыт в его потомке B
    // В данном случае под скрыт можно подразумевать только методы с protected, т.к private методы не будут наследоваться
    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }
}
