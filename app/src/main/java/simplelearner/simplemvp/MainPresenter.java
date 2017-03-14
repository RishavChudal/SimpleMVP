package simplelearner.simplemvp;

/**
 * Created by hrishav on 3/2/17.
 */
public class MainPresenter {
    MainView mainView;
    public MainPresenter(MainView mainView){
        this.mainView = mainView;
    }

    public void onButtonClicked(int id){
        switch (id){

            case (R.id.activity_main_btn_clouds):
                mainView.onCloudButtonClicked();
                break;

            case (R.id.activity_main_btn_sea):
                mainView.onSeaButtonClicked();
                break;

            case (R.id.activity_main_btn_mountain):
                mainView.onMountainButtonClicked();
                break;
        }
    }
}
