package med.voll.api.medico;

public enum Especialidade {

    ORTOPEDIA("ORTOPEDIA"),
    CARDIOLOGIA("CARDIOLOGIA"),
    GINECOLOGIA("GINECOLOGIA"),
    DERMATOLOGIA("DERMATOLOGIA");

    private String transformar;

    Especialidade(String transformar){
        this.transformar = transformar;
    }

    public static Especialidade fromString(String txt) {
        for (Especialidade especialidade : Especialidade.values()) {
            if (especialidade.transformar.equalsIgnoreCase(txt)) {
                return especialidade;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + txt);
    }
}
