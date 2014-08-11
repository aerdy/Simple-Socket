package Penjumlahan.wartech;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SocketPenjumlahanActivity extends Activity {
    /** Called when the activity is first created. */
	EditText text1;
	EditText text2;
	Button jumlah;
	Button kurang;
	Button bagi;
	Button kali;
	EditText hasil;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        text1 = (EditText)findViewById(R.id.editText1);
        text2 = (EditText)findViewById(R.id.editText2);
        hasil = (EditText)findViewById(R.id.editText3);
        jumlah = (Button)findViewById(R.id.button1);
        kurang = (Button)findViewById(R.id.button2);
        bagi = (Button)findViewById(R.id.button3);
        kali = (Button)findViewById(R.id.button4);
        
        jumlah.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int angka1 = Integer.parseInt(text1.getText().toString());
				int angka2 = Integer.parseInt(text2.getText().toString());
				
				//hasil.setText(angka1+angka2);
				int jumlahhasil = angka1+angka2;
				
				hasil.setText(""+jumlahhasil);
			}
		});
kurang.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int angka1 = Integer.parseInt(text1.getText().toString());
				int angka2 = Integer.parseInt(text2.getText().toString());
				
				//hasil.setText(angka1+angka2);
				int jumlahhasil = angka1-angka2;
				
				hasil.setText(""+jumlahhasil);
			}
		});
kali.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		int angka1 = Integer.parseInt(text1.getText().toString());
		int angka2 = Integer.parseInt(text2.getText().toString());
		
		//hasil.setText(angka1+angka2);
		int jumlahhasil = angka1/angka2;
		
		hasil.setText(""+jumlahhasil);
	}
});       
bagi.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		int angka1 = Integer.parseInt(text1.getText().toString());
		int angka2 = Integer.parseInt(text2.getText().toString());
		
		//hasil.setText(angka1+angka2);
		int jumlahhasil = angka1*angka2;
		
		hasil.setText(""+jumlahhasil);
	}
});
    }
}