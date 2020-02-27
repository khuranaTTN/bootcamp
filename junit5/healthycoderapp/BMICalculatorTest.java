package healthycoderapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void is_diet_recommended(){
        //given
        Double weight = 89.0;
        Double height = 1.70;
        //when
        Boolean test = BMICalculator.isDietRecommended(weight,height);
        //then
        assertTrue(test);


    }
    @Test
    void is_diet_notrecommended(){
        //given
        Double weight = 69.0;
        Double height = 1.70;
        //when
        Boolean test = BMICalculator.isDietRecommended(weight,height);
        //then
        assertFalse(test);


    }
    @Test
    void is_arithematic_exception(){
        //given
        Double weight = 69.0;
        Double height = 0.00;
        //when
        Executable executable = ()->BMICalculator.isDietRecommended(weight,height);

        //then
        assertThrows(ArithmeticException.class, executable);


    }
@Test
    void coder_with_worst_bmi(){
        //given
    List<Coder> coder = new ArrayList<>();
    coder.add(new Coder(1.89,70));
    coder.add(new Coder(1.80,84));
    coder.add(new Coder(1.66,50));
    coder.add(new Coder(1.90,80));
    //when
    Coder worstbmi = BMICalculator.findCoderWithWorstBMI(coder);
    //then
    assertEquals(1.80,worstbmi.getHeight());
}
    @Test
    void coder_with_worst_bmi_null_exception(){
        //given
        List<Coder> coder = new ArrayList<>();

        //when
        Coder worstbmi = BMICalculator.findCoderWithWorstBMI(coder);
        //then
       assertNull(worstbmi);
    }
    @Test
    void bmi_scores(){
        //given
        List<Coder> coder = new ArrayList<>();
        coder.add(new Coder(1.79,70));
        coder.add(new Coder(1.80,84));
        coder.add(new Coder(1.66,50));
        coder.add(new Coder(1.90,80));
        double [] result = {21.85,25.93,18.14,22.16};

        //when
    double[] bmi_result = BMICalculator.getBMIScores(coder);
        //then
       assertArrayEquals(result,bmi_result);
    }

}