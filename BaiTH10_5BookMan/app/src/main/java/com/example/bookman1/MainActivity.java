package com.example.bookman1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase databaseBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tạo mới/mở CSDL
        databaseBook = SQLiteDatabase.openOrCreateDatabase("MyBook.db",null);
      //TaoBangVaThemDuLieu();
      NapSACHvaoListview();
      ThemMoiSach(10 , "Mạng máy tính", 50, 10 ,"Sách về mạng");
    }
    void ThemMoiSach(int ma, String ten, int sotrang, float gia, String mota){
        String sqlThem= "INSERT INTO BOOKS VALUES( "+ ma + " , " + " ' " + ten + " '," + sotrang +"," +
                                                    gia + "," + " ' " + mota + " '  )";
        databaseBook.execSQL(sqlThem);
    }
    void XoaSach(int ma){

    }
    void CapNhat(int maGOC, String tenMOI, int sotrangMOI, float giaMoi, String motaMoi ){

    }
    void NapSACHvaoListview(){
        //1. Lấy tham chiếu đến Listview trong Layout
        ListView listView = (ListView) findViewById(R.id.lvSACH);
        //2. Nguồn dữ liệu
            //Mỗi phần tử là một String gồm: mã+tên+giá
        ArrayList<String> dsSach = new ArrayList<String>();
            //Mở DB, select dữ liệu, đưa vào ArrayList
        Cursor cs = databaseBook.rawQuery("SELECT * FROM BOOKS ", null);
        cs.moveToFirst();
            //  duyệt từng dòng bản ghi, tính toán
        while (true){
            if(cs.isAfterLast()==true) break;
            //Lấy mã sách
            int ms = cs.getInt(0); //Cột 0, ở dòng hiện tại
            //Lấy tên sách
            String tenSach= cs.getString(1);
            //Lấy giá bán
            Float gia= cs.getFloat(3);
            // Nối lại đưa vào arraylist
            String dong= String.valueOf(ms)+ " -- " +tenSach + " --- "+ String.valueOf(gia);
            //Đưa vào araylist
            dsSach.add(dong);
            //Sang dòng bản ghi tiếp
            cs.moveToNext();
        }
        //3. Adapter
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,dsSach);
            //Gán vào ListView
        listView.setAdapter(adapter);

    }
    void TaoBangVaThemDuLieu(){
        //Lệnh tạo bảng
        //Xóa bản nếu đã có
        String sqlXoaBang = "DROP TABLE IF EXISTS BOOKS";
        databaseBook.execSQL(sqlXoaBang);
        String sqlTaoBang ="CREATE TABLE BOOKS( BookID integer PRIMARY KEY," +
                " bookName text," +
                " Page integer," +
                " Price Float," +
                " Description text)";
        databaseBook.execSQL(sqlTaoBang);
        //Thêm bản ghi
        String sqlThem1 ="INSERT INTO BOOKS VALUES(1, 'Java', 100, 9.99, 'sách về java')";
        databaseBook.execSQL(sqlThem1);
        String sqlThem2 ="INSERT INTO BOOKS VALUES(2, 'Android', 320, 19.00, 'Android cơ bản')";
        databaseBook.execSQL(sqlThem2);
        String sqlThem3 ="INSERT INTO BOOKS VALUES(3, 'Học làm giàu', 120, 0.99, 'sách đọc cho vui')";
        databaseBook.execSQL(sqlThem3);
        String sqlThem4 ="INSERT INTO BOOKS VALUES(4, 'Tử điển Anh-Việt', 1000, 29.50, 'Từ điển 100.000 từ')";
        databaseBook.execSQL(sqlThem4);
        String sqlThem5 ="INSERT INTO BOOKS VALUES(5, 'CNXH', 1, 1, 'chuyện cổ tích')";
        databaseBook.execSQL(sqlThem5);
    }
}