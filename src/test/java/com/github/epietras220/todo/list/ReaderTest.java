package com.github.epietras220.todo.list;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class ReaderTest {

    @Test
    void whenFileNotExist_thenThrowException() throws IOException {
        LineReader lineReader = new LineReader();

        Throwable exception = assertThrows(
                NoSuchFileException.class,
                () -> {
                    lineReader.read("dane.xxx");
                }
        );
    }

    @Test
    void whenEntryCreatedFromLine_ThenLineFromEntryEqualsOriginalLine() {
        //given
        String sep = ";";
        String line = "emilka;2018-09-20 20:00;zadanie;false;2018-09-25 18:00";
        Entry entry = new Entry(line, sep);

        //then
        assertThat(entry.toCsvString(sep)).isEqualTo(line);
    }

    @Test
    void whenCsvStringCreatedFromEntry_ThenEntryCreatedFromLineEqualsOriginalEntry() {
        //given
        String line = "emilka;2018-09-20 20:00;zadanie;false;2018-09-25 18:00";
        String sep = ";";
        Entry entry = new Entry(line, sep);

        //when
        String csvString = entry.toCsvString(sep);
        String[] table = csvString.split(sep);
        String[] tableLine = line.split(sep);

        //then
        assertThat(table[2]).isEqualTo(tableLine[2]);


    }

}
