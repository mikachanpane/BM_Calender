package com.example.myapplication.Common.Text;

import java.lang.*;
import java.lang.String;


/**
 * 文字列操作を司るクラス
 * 
 * @author B.Muramatsu
 * 
 */
public class TxtMgr {
	

	/** 文字列を操作するメソッドを生成
	 * @returns ：整形結果
	 */
	static String TxtCut(String tai) {

		// まずは整形結果の入れ物を用意する
		StringBuilder rslt = new StringBuilder();

		// これなら先頭から2文字切り取って結果に代入
		rslt.append(String.format("{0}", tai.substring(0, 2)));

		// ↓などというように以下にメソッドなり制御を記述して下さい

		return rslt.toString();
	}

	
	
	/** 文字列の左端から指定した文字数分の文字列を返します
 	* @param val 取り出す元になる文字列
 	* @param length 取り出す文字数
 	* @return 左端から指定された文字数分の文字列 
 	*/
    public static String LeftEx(String val, int length) {

        if (length <= val.length()) {
            return val.substring(0, length);
        }

        return val;

    }
    
	/** 文字列の右端から指定された文字数分の文字列を返します
 	* @param val 取り出す元になる文字列
 	* @param length 取り出す文字数
 	* @return 右端から指定された文字数分の文字列 
 	*/
    public static String RightEx(String val, int length)
    {
        if (length <= val.length()) {
            return val.substring(val.length() - length);
        }

        return val;

    }

	/** 文字列の指定された文字位置以降のすべての文字列を返します
 	* @param val 取り出す元になる文字列
 	* @param start 0から始まる取り出し開始位置
 	* @return 指定された文字位置以降のすべての文字列
 	*/   
    public static String MidEx(String val, int start)
    {

        if (start < val.length())
        {
            return val.substring(start);
        }

        return "";
    }

	/** 文字列の指定された文字位置から、指定された文字数分の文字列を返します
 	* @param val 取り出す元になる文字列
 	* @param start 0から始まる取り出し開始位置
 	* @param length 終了
 	* @returns 指定された文字位置から指定された文字数分の文字列
 	*/   
    public static String MidEx(String val, int start, int length)
    {
        if (start < val.length())
        {
            if (start +length <= val.length())
            {
                return val.substring(start, length);
            }
            return val.substring(start);
        }

        return "";
    }

	/** 文字列の左端から指定したバイト数分の文字列を返します
 	* @param val 取り出す元になる文字列
 	* @param length 取り出すバイト数
 	* @returns 左端から指定されたバイト数分の文字列
 	*/  
    public static String LeftBEx(String val, int length) {

        return "";
        //return MidBEx(val, 0, length);

    }


    // TODO:以下作業中 2019/05/18  文太

//    /*
//	*//** 文字列の右端から指定されたバイト数分の文字列を返します
// 	* @param val 取り出す元になる文字列
// 	* @param length 取り出すバイト数*
// 	* @returns 右端から指定されたバイト数分の文字列
// 	*//*
//    public static String RightBEx(String val, int length) {
//
//    	String unicodeStirng = String.
//    	String unicodeStirng = new String(shift_jis_string.getBytes("iso-8859-1"), "Shift_JIS");
//
//        String hEncoding = new String();
//        byte[] btBytes = hEncoding.GetBytes(val);
//
//        return hEncoding.GetString(btBytes, btBytes.length - length, length);
//    }
//
//    /// <summary>
//    /// 文字列の指定されたバイト位置以降のすべての文字列を返します
//    /// </summary>
//    /// <param name="val">取り出す元になる文字列</param>
//    /// <param name="start">0から始まる取り出し開始位置</param>
//    /// <returns>指定されたバイト位置以降のすべての文字列</returns>
//    /// <remarks></remarks>
//    public static String MidBEx(String val, int start)
//    {
//
//        System.Text.Encoding hEncoding = System.Text.Encoding.GetEncoding("Shift_JIS");
//        byte[] btBytes = hEncoding.GetBytes(val);
//
//        if (start < btBytes.length)
//        {
//            return hEncoding.GetString(btBytes, start, btBytes.length - start);
//        }
//
//        return "";
//    }
//
//    ///<summary>
//    /// 文字列の指定されたバイト位置から、指定されたバイト数分の文字列を返します
//    /// </summary>
//    /// <param name="val">取り出す元になる文字列</param>
//    /// <param name="start">0から始まる取り出し開始位置</param>
//    /// <param name="length">取り出すバイト数</param>
//    /// <returns>指定されたバイト位置から指定されたバイト数分の文字列</returns>
//    /// <remarks></remarks>
//    public static String MidBEx(String val, int start, int length) {
//
//        System.Text.Encoding hEncoding = System.Text.Encoding.GetEncoding("Shift_JIS");
//        byte[] btBytes = hEncoding.GetBytes(val);
//
//        if (start < btBytes.length) {
//            if (start + length <= btBytes.length) {
//                return hEncoding.GetString(btBytes, start, length);
//            }
//            return hEncoding.GetString(btBytes, start, btBytes.length - start);
//        }
//        return "";
//    }
//
//
//    /// <summary>
//    /// 半角1バイト、全角2バイトとして、指定された文字列のバイト数を返します
//    /// </summary>
//    /// <param name="val">バイト数取得の対象となる文字列</param>
//    /// <returns>半角1バイト、全角2バイトでカウントされたバイト数</returns>
//    /// <remarks></remarks>
//    public static int LengthBEx(String val) {
//        return System.Text.Encoding.GetEncoding("Shift_JIS").GetByteCount(val);
//    }
//
//    /// <summary>
//    /// StringをDecimal型に変換し返します（変換出来ない場合は0を返す）
//    /// </summary>
//    /// <param name="val">変換するString</param>
//    /// <returns>変換後のDecimal</returns>
//    /// <remarks></remarks>
//    public static Decimal ToDecimalEx(String val)
//    {
//        try
//        {
//            //Nullの場合は""を返す
//            if (val == null)
//            {
//                return 0;
//            }
//
//            Decimal dc = new Decimal();
//
//            if (Decimal.TryParse(val, out dc))
//            {
//                return dc;
//            }
//            else
//            {
//                return 0;
//            }
//        }
//        catch(Execption ex)
//        {
//            return 0;
//        }
//    }
//
//    #endregion
//
//    #region "Decimal"
//
//    /// <summary>
//    /// 指定した精度の数値に四捨五入します
//    /// </summary>
//    /// <param name="val">丸め対象の倍精度浮動小数点数</param>
//    /// <param name="digits">戻り値の有効桁数の精度</param>
//    /// <returns>digitsに等しい精度の数値に四捨五入された数値</returns>
//    /// <remarks></remarks>
//    public static Decimal ToRoundEx(this Decimal val, int digits) {
//
//        double Coef = System.Math.Pow(10, digits);
//
//        decimal ret;
//
//        if ( val > 0){
//            ret =  System.Math.Floor((val * (decimal)Coef) + (decimal)0.5) / (decimal)Coef;
//            return ret;
//
//        } else{
//
//            ret = System.Math.Ceiling((val * (decimal)Coef) - (decimal)0.5) / (decimal)Coef;
//            return ret;
//
//        }
//
//
//    }
//
//    /// <summary>
//    /// 指定した精度の数値に切り上げします
//    /// </summary>
//    /// <param name="val">丸め対象の倍精度浮動小数点数</param>
//    /// <param name="digits">戻り値の有効桁数の精度</param>
//    /// <returns>digitsに等しい精度の数値に切り上げられた数値</returns>
//    /// <remarks></remarks>
//    public static Decimal ToRoundUpEx(this Decimal val, int digits) {
//
//        double dCoef = System.Math.Pow(10, digits);
//        decimal ret;
//
//        if ( val > 0) {
//            ret = System.Math.Ceiling(val * (decimal)dCoef) / (decimal)dCoef;
//            return ret;
//        } else{
//            ret = System.Math.Floor(val * (decimal)dCoef) / (decimal)dCoef;
//            return ret;
//        }
//
//
//    }
//
//    /// <summary>
//    /// 指定した精度の数値に切り捨てします
//    /// </summary>
//    /// <param name="val">丸め対象の倍精度浮動小数点数</param>
//    /// <param name="digits">戻り値の有効桁数の精度</param>
//    /// <returns>digitsに等しい精度の数値に切り捨てられた数値</returns>
//    /// <remarks></remarks>
//    public static Decimal ToRoundDownEx(this Decimal val, int digits) {
//
//         Double dCoef = System.Math.Pow(10, digits);
//        decimal ret;
//
//        if (val > 0){
//            ret = System.Math.Floor(val * (decimal)dCoef) / (decimal)dCoef;
//            return ret;
//        } else{
//            ret = System.Math.Ceiling(val * (decimal)dCoef) / (decimal)dCoef;
//            return ret;
//        }
//
//
//    }
//
//    #endregion
//
//    #region "Object"
//    /// <summary>
//    /// ObjectをDateTime?型に変換し返します（変換出来ない場合はNullを返す）
//    /// </summary>
//    /// <param name="val">変換するObject</param>
//    /// <returns>変換後のDateTime?</returns>
//    /// <remarks></remarks>
//    public static DateTime? ToDateEx(this Object val)
//    {
//
//        try
//        {
//            //Nullの場合は""を返す
//            if (val == null)
//            {
//                return null;
//            }
//
//            //日付に変換出来ない場合は""を返す
//            DateTime ym = new DateTime();
//            if (DateTime.TryParse(val.toString(), out ym))
//            {
//                //変換出来た場合は指定の書式で返す
//                return ym;
//            }
//            else
//            {
//                //変換出来ない場合は""を返す
//                return null;
//            }
//        }
//        catch(Execption ex)
//        {
//            return null;
//        }
//
//    }
//
//    /// <summary>
//    /// Objectを金額書式のString型に変換し返します（変換出来ない場合はそのまま返す）
//    /// </summary>
//    /// <param name="val">変換するObject</param>
//    /// <returns>カンマ付のString</returns>
//    /// <remarks></remarks>
//    public static String ToAmountEx(Object val)
//    {
//
//        try
//        {
//            //Nullの場合は""を返す
//            if (val == null)
//            {
//                return "";
//            }
//
//            if (val is decimal)
//            {
//                Decimal dc = (decimal)val;
//                return dc.toString("#,0");
//            }
//            else
//            {
//                //通貨に変換出来ない場合はそのままの値を返す
//                Decimal dc = new Decimal();
//                if (Decimal.TryParse(val.toString(), out dc))
//                {
//                    //変換出来た場合は指定の書式で返す
//                    return dc.toString("#,0");
//                }
//                else
//                {
//                    //変換出来ない場合はそのままの値を返す
//                    return val.toString();
//                }
//            }
//        }
//        catch(Execption ex)
//        {
//            return val.toString();
//        }
//
//    }
//
//    /// <summary>
//    /// ObjectをDecimal型に変換し返します（変換出来ない場合は0を返す）
//    /// </summary>
//    /// <param name="val">変換するObject</param>
//    /// <returns>変換後のDecimal</returns>
//    /// <remarks></remarks>
//    public static Decimal ToDecimalEx(this Object val)
//    {
//
//        try
//        {
//            //Nullの場合は0を返す
//            if (val == null)
//            {
//                return 0;
//            }
//
//            if (val is decimal)
//            {
//                Decimal dc = (decimal)val;
//                return dc;
//            }
//            else
//            {
//                //通貨に変換出来ない場合はそのままの値を返す
//                Decimal dc = new Decimal();
//                if (Decimal.TryParse(val.toString(), out dc))
//                {
//                    //変換出来た場合は指定の書式で返す
//                    return dc;
//                }
//                else
//                {
//                    //変換出来ない場合はそのままの値を返す
//                    return 0;
//                }
//            }
//        }
//        catch(Execption ex)
//        {
//            return 0;
//        }
//
//    }
//
//    /// <summary>
//    /// Objectをint型に変換し返します（変換出来ない場合は0を返す）
//    /// </summary>
//    /// <param name="val">変換するObject</param>
//    /// <returns>変換後のint</returns>
//    /// <remarks></remarks>
//    *//**
//     * @return
//     *//*
//    public static int ToIntlEx(Object val)
//    {
//        try
//        {
//            //Nullの場合は0を返す
//            if (val == null)
//            {
//                return 0;
//            }
//
//            if (val is int)
//            {
//                return (int)val;
//            }
//            else
//            {
//                //通貨に変換出来ない場合は0を返す
//                int iVal = new int();
//                if (int.TryParse(val.toString(), out iVal))
//                {
//                    //変換出来た場合は指定の書式で返す
//                    return iVal;
//                }
//                else
//                {
//                    //変換出来ない場合はそのままの値を返す
//                    return 0;
//                }
//            }
//        }
//        catch(Execption ex)
//        {
//            return 0;
//        }
//        finally
//        {
//        }
//    }
//
//
//    #endregion
//
//*//*//*/    "DateTime?"
////    ；：：：
//*//*
//    /// <summary>
//    /// 日付を指定の書式、又は空白に変換した値を返します
//    /// </summary>
//    /// <param name="val">変換する日付</param>
//    /// <param name="format">変換する書式（デフォルト="yyyyMMdd"）</param>
//    /// <returns>変換後の文字列</returns>
//    /// <remarks></remarks>
//    public static String toStringEx(DateTime val, String format = "yyyyMMdd")
//    {
//
//        try
//        {
//            //Nullの場合は""を返す
//            if (val == null)
//            {
//                return "";
//            }
//
//            //日付に変換出来ない場合は""を返す
//            DateTime ym = new DateTime();
//            if (DateTime.TryParse(val.Value.toString(), out ym))
//            {
//                //変換出来た場合は指定の書式で返す
//                return ym.toString(format);
//            }
//            else
//            {
//                //変換出来ない場合は""を返す
//                return "";
//            }
//        }
//        catch(Execption ex)
//        {
//            return "";
//        }
//        finally
//        {
//
//        }
//    }
//
//    #endregion
//
//    */

}
