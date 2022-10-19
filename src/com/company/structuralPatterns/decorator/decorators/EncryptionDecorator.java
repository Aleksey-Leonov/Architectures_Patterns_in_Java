package com.company.structuralPatterns.decorator.decorators;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        data += " 1234124";
        wrappee.writeData(data);


    }

    @Override
    public String readData() {
        wrappee.readData();
        String a = wrappee.readData();
        return a;
    }
}
