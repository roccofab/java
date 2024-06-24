public class StringModifier implements Runnable {
    private StringBuffer buffer;
    private char CharacterToAdd;
    private int repetitions;

    public StringModifier(StringBuffer buffer, char CharacterToAdd, int repetitions) {
        this.buffer = buffer;
        this.CharacterToAdd = CharacterToAdd;
        this.repetitions = repetitions;
    }

    @Override
    public void run() {
        for(int i = 0; i < repetitions; i++) {
            buffer.append(CharacterToAdd);
        }
    }
}
