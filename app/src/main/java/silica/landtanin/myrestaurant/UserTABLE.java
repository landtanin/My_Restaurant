package silica.landtanin.myrestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import silica.landtanin.myrestaurant.MyOpenHelper;

/**
 * Created by landtanin on 9/3/15 AD.
 */
public class UserTABLE {

    // Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public UserTABLE(Context context) {

        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();


    } // Constructor
} // Main Class
