import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class driver extends Application
{

	public static void main(String[] args) 
	{
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		// Setting constraints on the size of the columns
		GridPane grid = new GridPane();
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(25);
		col1.setHalignment(HPos.CENTER);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(25);
		col2.setHalignment(HPos.CENTER);
		ColumnConstraints col3 = new ColumnConstraints();
		col3.setPercentWidth(25);
		col3.setHalignment(HPos.CENTER);
		ColumnConstraints col4 = new ColumnConstraints();
		col4.setPercentWidth(25);
		col4.setHalignment(HPos.CENTER);
		grid.getColumnConstraints().addAll(col1, col2, col3, col4);
		
		// Setting constraints on the size of the rows
		RowConstraints row1 = new RowConstraints();
		row1.setPercentHeight(50);
		row1.setValignment(VPos.CENTER);
		RowConstraints row2 = new RowConstraints();
		row2.setPercentHeight(50);
		row2.setValignment(VPos.CENTER);
		grid.getRowConstraints().addAll(row1, row2);
		
		Label bin = new Label("Binary");
		Label deci = new Label("Decimal");
		Label hex = new Label("Hexadecimal");
		Label oct = new Label("Octal");
		
		TextField binText = new TextField();
		TextField deciText = new TextField();
		TextField hexText = new TextField();
		TextField octText = new TextField();
		
		grid.add(bin, 0, 0);
		grid.add(deci, 1, 0);
		grid.add(hex, 2, 0);
		grid.add(oct, 3, 0);
		grid.add(binText, 0, 1);
		grid.add(deciText, 1, 1);
		grid.add(hexText, 2, 1);
		grid.add(octText, 3, 1);
		
		Scene scene = new Scene(grid, 300, 150);
		stage.setScene(scene);
		stage.show();
	}

}
