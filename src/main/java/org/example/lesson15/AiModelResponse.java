package org.example.lesson15;

// В данном случае происходит общение с аи-агентом,
// который может либо ответить как часть диалога, чтобы что-то уточнить у пользователя,
// а может вернуть составленный план действий, при этом план вернется в том же поле, но будет выставлен флаг isPlan
public class AiModelResponse {
    private String response;
    private boolean isPlan;
}

// Теперь присутствует разделение на обычный диалоговый ответ и ответ с планом.
class AiModelDialogMessage {}

class DialogResponse extends AiModelDialogMessage {
    private String response;
}

class PlanResponse extends AiModelDialogMessage {
    private String plan;
}
