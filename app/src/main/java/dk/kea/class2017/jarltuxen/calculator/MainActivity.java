package dk.kea.class2017.jarltuxen.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private double total = 0.0;
    private boolean clearOnNumber = true;
    private String value = "0";
    private char operand = ' ';
    private boolean decimal = false;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private double calculate(char operand, double extra)
    {
        double calcResult = 0.0;
        switch (operand)
        {
            case ' ':
                calcResult = extra;
                break;
            case '+':
            {
                calcResult =  total + extra;
                break;            }
            case '-':
            {
                calcResult =  total - extra;
                break;            }
            case '*':
            {
                calcResult =  total * extra;
                break;            }
            case '/':
            {
                calcResult =  total / extra;
                break;            }
        }
        return calcResult;
    }

    public void onBtnAnyClick(View v)
    {
        Button thisButton = (Button) v;
        String str = thisButton.getText().toString();
        char buttonText = str.charAt(0);
        TextView outResult = (TextView) findViewById(R.id.TextViewResult);
        switch (buttonText)
        {
            case '0':
            {
                if (!clearOnNumber)
                {
                    value = value + "0";
                    outResult.setText(String.valueOf(value));
                }
            break;
            }
            case '1':
            {
                if (clearOnNumber)
                {
                    value = "1";
                    clearOnNumber=false;
                    outResult.setText(String.valueOf(value));
                }
                else
                {
                    value = value + "1";
                    outResult.setText(String.valueOf(value));
                }
                break;
            }
            case '2':
            {
                if (clearOnNumber)
                {
                    value = "2";
                    clearOnNumber=false;
                    outResult.setText(String.valueOf(value));
                }
                else
                {
                    value = value + "2";
                    outResult.setText(String.valueOf(value));
                }
                break;
            }
            case '3':
            {
                if (clearOnNumber)
                {
                    value = "3";
                    clearOnNumber=false;
                    outResult.setText(String.valueOf(value));
                }
                else
                {
                    value = value + "3";
                    outResult.setText(String.valueOf(value));
                }
                break;
            }
            case '4':
            {
                if (clearOnNumber)
                {
                    value = "4";
                    clearOnNumber=false;
                    outResult.setText(String.valueOf(value));
                }
                else
                {
                    value = value + "4";
                    outResult.setText(String.valueOf(value));
                }
                break;
            }
            case '5':
            {
                if (clearOnNumber)
                {
                    value = "5";
                    clearOnNumber=false;
                    outResult.setText(String.valueOf(value));
                }
                else
                {
                    value = value + "5";
                    outResult.setText(String.valueOf(value));
                }
                break;
            }
            case '6':
            {
                if (clearOnNumber)
                {
                    value = "6";
                    clearOnNumber=false;
                    outResult.setText(String.valueOf(value));
                }
                else
                {
                    value = value + "6";
                    outResult.setText(String.valueOf(value));
                }
                break;
            }
            case '7':
            {
                if (clearOnNumber)
                {
                    value = "7";
                    clearOnNumber=false;
                    outResult.setText(String.valueOf(value));
                }
                else
                {
                    value = value + "7";
                    outResult.setText(String.valueOf(value));
                }
                break;
            }
            case '8':
            {
                if (clearOnNumber)
                {
                    value = "8";
                    clearOnNumber=false;
                    outResult.setText(String.valueOf(value));
                }
                else
                {
                    value = value + "8";
                    outResult.setText(String.valueOf(value));
                }
                break;
            }
            case '9':
            {
                if (clearOnNumber)
                {
                    value = "9";
                    clearOnNumber=false;
                    outResult.setText(String.valueOf(value));
                }
                else
                {
                    value = value + "9";
                    outResult.setText(String.valueOf(value));
                }
                break;
            }
            case '+':
            {
                //double opvalue = String.valueOf(value);
                double opvalue = Double.valueOf(value);
                total = calculate(operand, opvalue);
                outResult.setText(String.valueOf(total));
                clearOnNumber = true;
                operand = '+';
                decimal = false;
                break;
            }
            case '-':
            {
                double opvalue = Double.valueOf(value);
                total = calculate(operand, opvalue);
                outResult.setText(String.valueOf(total));
                clearOnNumber = true;
                operand = '-';
                decimal = false;
                break;
            }
            case '*':
            {
                double opvalue = Double.valueOf(value);
                total = calculate(operand, opvalue);
                outResult.setText(String.valueOf(total));
                clearOnNumber = true;
                operand = '*';
                decimal = false;
                break;
            }
            case '/':
            {
                double opvalue = Double.valueOf(value);
                total = calculate(operand, opvalue);
                outResult.setText(String.valueOf(total));
                clearOnNumber = true;
                operand = '/';
                decimal = false;
                break;
            }
            case '=':
            {
                double opvalue = Double.valueOf(value);
                total = calculate(operand, opvalue);
                outResult.setText(String.valueOf(total));
                clearOnNumber = true;
                value = Double.toString(total);
                operand = ' ';
                decimal = false;
                break;
            }
            case '.':
            {
                if (clearOnNumber)
                {
                    value = "0.";
                    decimal = true;
                    clearOnNumber=false;
                    outResult.setText(String.valueOf(value));
                }
                else
                {
                    if (!decimal)
                    {
                        value = value + ".";
                        decimal = true;
                        outResult.setText(String.valueOf(value));
                    }
                }
                break;
            }
            case 'C':
            {
                total = 0.0;
                clearOnNumber = true;
                decimal = false;
                value = "0";
                operand = ' ';
                outResult.setText(String.valueOf(total));
                break;
            }
        }
    }
}
