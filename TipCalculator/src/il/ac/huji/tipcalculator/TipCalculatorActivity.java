package il.ac.huji.tipcalculator;

import java.text.DecimalFormat;
import java.lang.Math;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class TipCalculatorActivity extends Activity {
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
        
    	final double TIP_PRECENT = 0.12;

        final Button buttonCalc = (Button) findViewById(R.id.btnCalculate);
        buttonCalc.setText("Calculate");
        buttonCalc.setTextColor(Color.BLACK);
        
        final CheckBox checkRound = (CheckBox) findViewById(R.id.chkRound);
        checkRound.setText("Round to nearest dollar");
        checkRound.setChecked(false);
        
        final EditText billAmount = (EditText) findViewById(R.id.edtBillAmount);

        final TextView tipRes = (TextView) findViewById(R.id.txtTipResult);

        buttonCalc.setOnClickListener(new OnClickListener() {
 
		});

    }



    
    
    
    
    
}
