package listener;

import model.ExerciseModel;
import model.FoodModel;
import model.LogModel;
import view.ActivityLevels;
import view.BasicFoodView;
import view.ExerciseView;
import view.FoodAndActivityView;
import view.FoodConsumption;
import view.MainView;
import view.RecipeView;
import javafx.event.ActionEvent;

import javafx.event.EventHandler;

public class BackToHomeButtonFromFoodConsumptionListener extends Listener implements EventHandler<ActionEvent> {

  public BackToHomeButtonFromFoodConsumptionListener(FoodModel foodModel, LogModel logModel,
      ExerciseModel exerciseModel,
      MainView mainView,
      BasicFoodView basicFoodView, RecipeView recipeView, ExerciseView exerciseView, FoodConsumption foodConsumption,
      ActivityLevels activityLevels, FoodAndActivityView foodAndActivityView) {
    super(foodModel, logModel, exerciseModel, mainView, basicFoodView, recipeView, exerciseView, foodConsumption,
        activityLevels, foodAndActivityView);
  }

  @Override
  public void handle(ActionEvent event) {
    this.getMainView().displayComponentView(this.getFoodAndActivityView());
  }

}