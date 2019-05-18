package com.example.myapplication.Entities;

import com.yahoo.squidb.annotations.ColumnSpec;
import com.yahoo.squidb.annotations.PrimaryKey;
import com.yahoo.squidb.annotations.TableModelSpec;


@TableModelSpec(className="Calender", tableName="T_CALAENDER")
class CalenderSpec{

    @PrimaryKey
    @ColumnSpec(defaultValue = "", constraints =  "NOT NULL")
    String PK_MON;

    @ColumnSpec(defaultValue = "", constraints =  "NOT NULL")
    String PK_DAY;

    @ColumnSpec(defaultValue = "", constraints =  "NOT NULL")
    String CUSCD;

    @ColumnSpec(defaultValue = "", constraints =  "NOT NULL")
    String GPSID;

    @ColumnSpec(defaultValue = "", constraints =  "NOT NULL")
    String DTL1;

    @ColumnSpec(defaultValue = "", constraints =  "NOT NULL")
    String DTL2;

    @ColumnSpec(defaultValue = "", constraints =  "NOT NULL")
    String BIKO1;

    @ColumnSpec(defaultValue = "", constraints =  "NOT NULL")
    String BIKO2;
}


@TableModelSpec(className = "Customer", tableName = "M_CUSTOMER")
class  CustomerSpec{

    @PrimaryKey
    @ColumnSpec(defaultValue = "", constraints = "NOT NULL")
    String CD;

    @ColumnSpec(defaultValue = "", constraints = "NOT NULL")
    String NAME1;

    @ColumnSpec(defaultValue = "", constraints = "NOT NULL")
    String NAME2;

    @ColumnSpec(defaultValue = "", constraints = "NOT NULL")
    String KANA;

    @ColumnSpec(defaultValue = "", constraints = "NOT NULL")
    String ZIP;

    @ColumnSpec(defaultValue = "", constraints = "NOT NULL")
    String ADDRESS;

    @ColumnSpec(defaultValue = "", constraints = "NOT NULL")
    String TEL;

    @ColumnSpec(defaultValue = "", constraints = "NOT NULL")
    String FAX;

    @ColumnSpec(defaultValue = "", constraints = "NOT NULL")
    String BIKO1;

    @ColumnSpec(defaultValue = "", constraints = "NOT NULL")
    String BIKO2;
}

