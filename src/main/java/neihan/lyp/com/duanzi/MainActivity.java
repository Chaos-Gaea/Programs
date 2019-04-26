package neihan.lyp.com.duanzi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import neihan.lyp.baselibrary.ioc.CheckNet;
import neihan.lyp.baselibrary.ioc.OnCLick;
import neihan.lyp.baselibrary.ioc.ViewById;
import neihan.lyp.baselibrary.ioc.ViewUtils;

public class MainActivity extends AppCompatActivity {
    @ViewById(R.id.text)
    private TextView mText;
    @ViewById(R.id.img)
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewUtils.inject(this);

        mText.setText("this my IOC");
    }


    @OnCLick(R.id.text)

    @CheckNet
    private void Onclick(TextView view){

        int  i = 2/1;
        Toast.makeText(this, "wenzi "+ i, Toast.LENGTH_SHORT).show();
    }



    @OnCLick(R.id.img)
    private void Onclick(ImageView view){

        int i =  2/2;
        Toast.makeText(this, "tupian  " + i, Toast.LENGTH_SHORT).show();
    }



}
