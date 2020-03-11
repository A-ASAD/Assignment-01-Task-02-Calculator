package pk.edu.pucit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import org.mariuszgromada.math.mxparser.*;
//import net.objecthunter.exp4j.*;


public class MainActivity extends AppCompatActivity {

    private TextView tvEquation;
    private TextView tvResult;
    private boolean isEvaluated =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvEquation = findViewById(R.id.tv_equation);
        tvResult = findViewById(R.id.tv_result);
    }

    public void keyPress(View v) {
        switch (v.getId()){
            case R.id.zero:
                if(isEvaluated){
                    tvEquation.setText("");
                    isEvaluated=false;
                }
                tvEquation.append("0");
                break;
            case R.id.one:
                if(isEvaluated){
                    tvEquation.setText("");
                    isEvaluated=false;
                }
                tvEquation.append("1");
                break;
            case R.id.two:
                if(isEvaluated){
                    tvEquation.setText("");
                    isEvaluated=false;
                }
                tvEquation.append("2");
                break;
            case R.id.three:
                if(isEvaluated){
                    tvEquation.setText("");
                    isEvaluated=false;
                }
                tvEquation.append("3");
                break;
            case R.id.four:
                if(isEvaluated){
                    tvEquation.setText("");
                    isEvaluated=false;
                }
                tvEquation.append("4");
                break;
            case R.id.five:
                if(isEvaluated){
                    tvEquation.setText("");
                    isEvaluated=false;
                }
                tvEquation.append("5");
                break;
            case R.id.six:
                if(isEvaluated){
                    tvEquation.setText("");
                    isEvaluated=false;
                }
                tvEquation.append("6");
                break;
            case R.id.seven:
                if(isEvaluated){
                    tvEquation.setText("");
                    isEvaluated=false;
                }
                tvEquation.append("7");
                break;
            case R.id.eight:
                if(isEvaluated){
                    tvEquation.setText("");
                    isEvaluated=false;
                }
                tvEquation.append("8");
                break;
            case R.id.nine:
                if(isEvaluated){
                    tvEquation.setText("");
                    isEvaluated=false;
                }
                tvEquation.append("9");
                break;
            case R.id.ac:
                tvEquation.setText("");
                tvResult.setText("");
                isEvaluated=false;
                break;
            case R.id.div:
                tvEquation.append("/");
                isEvaluated=false;
                break;
            case R.id.mul:
                tvEquation.append("*");
                isEvaluated=false;
                break;
            case R.id.minus:
                tvEquation.append("-");
                isEvaluated=false;
                break;
            case R.id.plus:
                tvEquation.append("+");
                isEvaluated=false;
                break;
            case R.id.mod:
                tvEquation.append("%");
                isEvaluated=false;
                break;
            case R.id.del:
                String s=tvEquation.getText().toString();
                if(s.length() > 0)
                    s=s.substring(0,s.length()-1);
                tvEquation.setText(s);
                break;
            case R.id.dot:
                if(isEvaluated){
                    tvEquation.setText("");
                    isEvaluated=false;
                }
                tvEquation.append(".");
                break;
            case R.id.dbzero:
                if(isEvaluated){
                    tvEquation.setText("");
                    isEvaluated=false;
                }
                tvEquation.append("00");
                break;
            case R.id.equalTo:
                isEvaluated=true;
                Expression e = new Expression(tvEquation.getText().toString());
                double res = e.calculate();
                if(Double.isNaN(res)){
                    tvResult.setText("Bad Expression");
                }
                else if(res - Math.round(res) == 0)
                    tvResult.setText(Integer.toString((int)Math.round(res)));
                else
                    tvResult.setText(Double.toString((double)Math.round(res*100)/100));
        }
    }

}
