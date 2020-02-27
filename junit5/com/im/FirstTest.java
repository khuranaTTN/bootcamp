package com.im;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {
    First first = new First();
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void return_updatedstring_iffoundthesubstring(String main,String sub,String replace){

        //given
        String main_string =  main;
        String sub_string =  sub;
        String replace_string =  replace;
        String required_string =  "helli";

        //when
        String new_string = first.replaceSubString(main_string,sub_string,replace_string);

        //then
        assertEquals(new_string,required_string);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data1.csv")
    void should_not_except_null(String main1,String sub1,String replace1) {

        //given
        String main_string = main1;
        String sub_string = sub1;
        String replace_string = replace1;

        //when
        String new_string = first.replaceSubString(main_string, sub_string, replace_string);

        //then
        assertEquals(new_string, main1);

    }
    @Test
    void Should_filter_even_elements(){
        //given
        List<Integer> list = new ArrayList<>();
        List<Integer> result = Arrays.asList(1,3,5,7);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        //when
        List<Integer> compare = first.filterEvenElements(list);

        //then
        assertEquals(compare,result);
    }

       @Test
    void calculate_average(){
        //given
           List<BigDecimal> bg = new ArrayList<>();
           bg.add(new BigDecimal("2.50"));
           bg.add(new BigDecimal("2.50"));
           bg.add(new BigDecimal("5.00"));
           bg.add(new BigDecimal("10.00"));
           BigDecimal result = new BigDecimal("5.00");

           //when
           BigDecimal trial = first.calculateAverage(bg);
           //then
           assertEquals(trial,result);
       }
       @Test
    void throws_exception(){
        //given
        List<BigDecimal> bg = new ArrayList<>();

        //when
        Executable executable = ()-> first.calculateAverage(bg);

        //then
        assertThrows(RuntimeException.class,executable
        );
    }
    @Test
    void if_string_is_pallindrome(){
        //given
        String st = "heh";
        //when
        Boolean result = first.isPallindrome(st);
        //then
        assertTrue(result);

    }
    @Test
    void if_string_is_not_pallindrome(){
        //given
        String st = "chirag";
        //when
        Boolean result = first.isPallindrome(st);
        //then
        assertFalse(result);

    }





}