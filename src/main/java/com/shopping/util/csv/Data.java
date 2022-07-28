package com.shopping.util.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Data {

    String source;

    public String getData() {
        return source;
    }

    public void setData(String data) {
        this.source = data;
    }

    public String getData(int column, int row, String fileName) {
        try {
            Reader reader = new FileReader(fileName);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withDelimiter(',')
                    .parse(reader);

            int rowData = 0;

            for (CSVRecord eachRecord : records) {
                setData(eachRecord.get(column));
                rowData++;
                if (rowData == row) {
                    return getData();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return getData();
    }

}
