package as.bwei.com.wenhaozk1.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by HP on 2018/9/3.
 */

public class Wen extends View{

    private int wsize = 50;
    private int hsize = 50;
    private int top;
    private String texttop;
    private String sumtop;
    private int left = 70;
    private Integer [] a={600,640,500,560};
    private String [] c={"0.00%","5.00%","10.00%","15.00%","20.00%","25.00%","30.00%"};
    private String [] b={"管理成本","劳务成本","销售成本","资产盘亏"};
    private int textleft = 70;
    private int sumleft = 395;
    private int right = 120;
    private Paint mpaint;
    private Paint paint1;

    public Wen(Context context) {
        this(context,null);
    }

    public Wen(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Wen(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mpaint = new Paint();
        paint1 = new Paint();
        paint1.setColor(Color.BLUE);//柱形颜色
        mpaint.setColor(Color.BLACK);//横竖条颜色
        mpaint.setStrokeWidth(5);//宽度
        mpaint.setTextSize(20);//字体
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(50,400,700,400,mpaint);//横轴
        canvas.drawLine(50,50,50,400,mpaint);//竖轴
        canvas.drawText("成本费用占比",300,50,mpaint);
        canvas.drawText("27.64",70,100,mpaint);
        canvas.drawText("28.17",170,80,mpaint);
        canvas.drawText("21.48",270,150,mpaint);
        canvas.drawText("22.70",370,120,mpaint);

        for (int j=0;j<a.length;j++){
            top = a[j] / 2;
            canvas.drawRect(left,400-top,right,400,paint1);
            left+=100;
            right+=100;
        }

        for (int j=0;j<b.length;j++){
            texttop = b[j];
            canvas.drawText(texttop,textleft,450,mpaint);
            textleft+=90;
        }

        for (int k=0;k<c.length;k++){
            sumtop = c[k];
            canvas.drawText(sumtop,0,sumleft,mpaint);
            sumleft-=50;
        }
    }
}
