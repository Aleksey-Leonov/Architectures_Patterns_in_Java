package com.company.structuralPatterns.decorator.decorators;

public class FileDataSource implements DataSource {

    public FileDataSource(String filename) {

    }

    @Override
    public void writeData(String data) {
        System.out.println("Данные в файл " + data +" записаны");
    }

    @Override
    public String readData() {
        return "чтение данных файла";
    }
}
