package org.example.lesson21;


// Льготное наследование
public class CodeAnalyzer {
    public static final Integer ANALYZE_FAILED_STATUS = 1;
    public static final Integer ANALYZE_SUCCESSFUL_STATUS = 0;

    public Integer analyze(String code) {
        System.out.println("Производится проверка на количество вложенных if и классические правила правильного кода");

        return ANALYZE_SUCCESSFUL_STATUS;
    }
}

class JavaCodeAnalyzer extends CodeAnalyzer {

    public Integer analyze(String code) {

        javaCodeAnalyze(code);
        return ANALYZE_SUCCESSFUL_STATUS;
    }

    private Integer javaCodeAnalyze(String code) {
        System.out.println("Проверка классических антипаттернов в java");
        return ANALYZE_SUCCESSFUL_STATUS;
    }
}


// Наследование реализации

abstract class TextFilter {

    abstract String filter(String text);
}

class BadWordFilter extends TextFilter {

    @Override
    String filter(String text) {
        return "Очищаем нецензурные слова";
    }
}

class ChildTextFilter extends BadWordFilter {

    @Override
    String filter(String text) {
        String badWordFiltered = super.filter(text);

        return badWordFiltered + "Удалили двусмысленные темы";
    }
}
