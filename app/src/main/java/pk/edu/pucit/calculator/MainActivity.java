package pk.edu.pucit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    TextView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn00,btnAc,btnDel,btnDiv,btnAdd,btnSub,btnMul,btnEq,btnPer,btnDot,equ,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (TextView) findViewById(R.id.btn1);
        btn2 = (TextView) findViewById(R.id.btn2);
        btn3 = (TextView) findViewById(R.id.btn3);
        btn4 = (TextView) findViewById(R.id.btn4);
        btn5 = (TextView) findViewById(R.id.btn5);
        btn6 = (TextView) findViewById(R.id.btn6);
        btn7 = (TextView) findViewById(R.id.btn7);
        btn8 = (TextView) findViewById(R.id.btn8);
        btn9 = (TextView) findViewById(R.id.btn9);
        btn0 = (TextView) findViewById(R.id.btn0);
        btn00 = (TextView) findViewById(R.id.btn00);
        btnAc = (TextView) findViewById(R.id.btnAC);
        btnDel = (TextView) findViewById(R.id.btnDel);
        btnDiv = (TextView) findViewById(R.id.btnDiv);
        btnAdd = (TextView) findViewById(R.id.btnAdd);
        btnMul = (TextView) findViewById(R.id.btnMul);
        btnSub = (TextView) findViewById(R.id.btnSub);
        btnPer = (TextView) findViewById(R.id.btnPer);
        btnEq = (TextView) findViewById(R.id.btnEq);
        btnDot = (TextView) findViewById(R.id.btnDot);
        equ = (TextView) findViewById(R.id.tv_equation);
        res = (TextView) findViewById(R.id.tv_result);
    }
    public void onClick(View view){
        String str=((TextView)view).getText().toString();
        String eq=String.valueOf(equ.getText());
//        int length=eq.length();
//        String last=eq.substring(length-1,length);
        if((equ.length()==0) && ((str.equals("+"))|| (str.equals("X"))||(str.equals("/"))||(str.equals("."))||(str.equals("%")))) {
            equ.setText("");
        }
//        else if((equ.length()>0)&&(last.equals("-"))){
//            equ.setText(equ+"");
//        }
        else{
            equ.setText(equ.getText() + str);
        }
    }
    public void ac(View view){
        equ.setText("");
        res.setText("");
    }
    public void equate(View view) {

    }
    public void del(View view){
        String eq=String.valueOf(equ.getText());
        if(equ.length()>0){
            equ.setText(eq.substring(0,eq.length()-1));
        }
    }
}