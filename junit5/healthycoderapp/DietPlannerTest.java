package healthycoderapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DietPlannerTest {
    private  DietPlanner dietPlanner;
    @BeforeEach
    void setup(){
        this.dietPlanner=new DietPlanner(20,30,50);
    }


    @Test
    void return_CorrectDietPlan_For_CorrectCoder(){

//given
        Coder coder= new Coder(1.82, 75.0, 21, Gender.MALE);
        DietPlan expected= new DietPlan(2242, 112, 75,280);

//when
        DietPlan result= dietPlanner.calculateDiet(coder);

//then
        assertAll(
                () -> assertEquals(expected.getCalories(), result.getCalories()),
                ()-> assertEquals(expected.getCarbohydrate(), result.getCarbohydrate()),
                ()->assertEquals(expected.getFat(), result.getFat()),
                ()->assertEquals(expected.getProtein(), result.getProtein())
        );

     }


}
