package simplelearner.simplemvp;

/**
 * Created by hrishav on 2/26/17.
 */

/**
 * creating View as a interface which is going to implement these methods on activity
 */
public interface MainView {
    void onCloudButtonClicked();
    void onSeaButtonClicked();
    void onMountainButtonClicked();
}
