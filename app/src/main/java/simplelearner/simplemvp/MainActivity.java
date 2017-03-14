package simplelearner.simplemvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView{
    @Bind(R.id.activity_main_btn_clouds)
    Button cloud;
    @Bind(R.id.activity_main_btn_sea)
    Button sea;
    @Bind(R.id.activity_main_btn_mountain)
    Button mountain;
    @Bind(R.id.activity_main_tv)
    TextView actionTv;
    @Bind(R.id.activity_main_iv)
    ImageView displayImage;
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setTextView();
        mainPresenter = new MainPresenter(this);
    }

    @Override
    protected void onResume(){
        super.onResume();

    }

    private void setTextView() {
        actionTv.setText(R.string.default_msg);
    }

    @OnClick(R.id.activity_main_btn_clouds)
    public void cloud(){
        mainPresenter.onButtonClicked(R.id.activity_main_btn_clouds);
    }

    @OnClick(R.id.activity_main_btn_sea)
    public void sea(){
        mainPresenter.onButtonClicked(R.id.activity_main_btn_sea);
    }

    @OnClick(R.id.activity_main_btn_mountain)
    public void mountain(){
        mainPresenter.onButtonClicked(R.id.activity_main_btn_mountain);
    }



    @Override
    public void onCloudButtonClicked() {
        displayImage.setImageResource(R.drawable.clouds);
        actionTv.setText(R.string.on_cloud_btn_clicked);
    }

    @Override
    public void onSeaButtonClicked() {
        displayImage.setImageResource(R.drawable.sea);
        actionTv.setText(R.string.on_sea_btn_clicked);
    }

    @Override
    public void onMountainButtonClicked() {
        displayImage.setImageResource(R.drawable.mountain);
        actionTv.setText(R.string.on_mountain_btn_clicked);
    }
}
