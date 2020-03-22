package Utils;


import GUI.Login;
import Repo.RepoAngajat;
import Repo.RepoExcursie;
import Repo.RepoRezervare;
import Service.Service;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        RepoAngajat repoAngajat=new RepoAngajat();
        RepoExcursie repoExcursie=new RepoExcursie();
        RepoRezervare repoRezervare=new RepoRezervare();
        Service service=new Service(repoAngajat,repoRezervare,repoExcursie);
        Parent root;
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("/Login.fxml"));
        Login afis=new Login(service,primaryStage);

        loader.setController(afis);
        root = loader.load();
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root ));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}