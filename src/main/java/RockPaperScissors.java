import java.util.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaperScissors {
  public static void main(String[] args) {
    // get("/", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/home.vtl");
    //   return new ModelAndView(model, "templates/layout.vtl");
    // }, new VelocityTemplateEngine());
    //
    // get("/detector", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //
    //   String userInput = request.queryParams("number");
    //   NumbersToWords newNumbers = new NumbersToWords();
    //   String convertedNumber = newNumbers.integerConverter(userInput);
    //   model.put("convertedNumber", convertedNumber);
    //
    //   model.put("template", "templates/detector.vtl");
    //   return new ModelAndView(model, "templates/layout.vtl");
    // }, new VelocityTemplateEngine());
  }

  public static String rpsGame(String input1, String input2) {
    String rock = "rock";
    String paper = "paper";
    String scissor = "scissor";
    if(input1 == input2){
      return "tie";
    } else if(input1 == rock && input2 == paper){
      return "player2 wins";
    } else if(input1 == rock && input2 == scissor){
      return "player1 wins";
    } else if(input1 == paper && input2 == scissor){
      return "player2 wins";
    } else{
      return "true";
    }
  }

}