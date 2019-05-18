package com.example.myapplication.Common.Text;

import java.lang.*;
import java.lang.String;


/**
 * �����񑀍���i��N���X
 * 
 * @author B.Muramatsu
 * 
 */
public class TxtMgr {
	

	/** ������𑀍삷�郁�\�b�h�𐶐�
	 * @returns �F���`����
	 */
	static String TxtCut(String tai) {

		// �܂��͐��`���ʂ̓��ꕨ��p�ӂ���
		StringBuilder rslt = new StringBuilder();

		// ����Ȃ�擪����2�����؂����Č��ʂɑ��
		rslt.append(String.format("{0}", tai.substring(0, 2)));

		// ���ȂǂƂ����悤�Ɉȉ��Ƀ��\�b�h�Ȃ萧����L�q���ĉ�����

		return rslt.toString();
	}

	
	
	/** ������̍��[����w�肵�����������̕������Ԃ��܂�
 	* @param val ���o�����ɂȂ镶����
 	* @param length ���o��������
 	* @return ���[����w�肳�ꂽ���������̕����� 
 	*/
    public static String LeftEx(String val, int length) {

        if (length <= val.length()) {
            return val.substring(0, length);
        }

        return val;

    }
    
	/** ������̉E�[����w�肳�ꂽ���������̕������Ԃ��܂�
 	* @param val ���o�����ɂȂ镶����
 	* @param length ���o��������
 	* @return �E�[����w�肳�ꂽ���������̕����� 
 	*/
    public static String RightEx(String val, int length)
    {
        if (length <= val.length()) {
            return val.substring(val.length() - length);
        }

        return val;

    }

	/** ������̎w�肳�ꂽ�����ʒu�ȍ~�̂��ׂĂ̕������Ԃ��܂�
 	* @param val ���o�����ɂȂ镶����
 	* @param start 0����n�܂���o���J�n�ʒu
 	* @return �w�肳�ꂽ�����ʒu�ȍ~�̂��ׂĂ̕�����
 	*/   
    public static String MidEx(String val, int start)
    {

        if (start < val.length())
        {
            return val.substring(start);
        }

        return "";
    }

	/** ������̎w�肳�ꂽ�����ʒu����A�w�肳�ꂽ���������̕������Ԃ��܂�
 	* @param val ���o�����ɂȂ镶����
 	* @param start 0����n�܂���o���J�n�ʒu
 	* @param length �I��
 	* @returns �w�肳�ꂽ�����ʒu����w�肳�ꂽ���������̕�����
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

	/** ������̍��[����w�肵���o�C�g�����̕������Ԃ��܂�
 	* @param val ���o�����ɂȂ镶����
 	* @param length ���o���o�C�g��
 	* @returns ���[����w�肳�ꂽ�o�C�g�����̕�����
 	*/  
    public static String LeftBEx(String val, int length) {

        return "";
        //return MidBEx(val, 0, length);

    }


    // TODO:�ȉ���ƒ� 2019/05/18  ����

//    /*
//	*//** ������̉E�[����w�肳�ꂽ�o�C�g�����̕������Ԃ��܂�
// 	* @param val ���o�����ɂȂ镶����
// 	* @param length ���o���o�C�g��*
// 	* @returns �E�[����w�肳�ꂽ�o�C�g�����̕�����
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
//    /// ������̎w�肳�ꂽ�o�C�g�ʒu�ȍ~�̂��ׂĂ̕������Ԃ��܂�
//    /// </summary>
//    /// <param name="val">���o�����ɂȂ镶����</param>
//    /// <param name="start">0����n�܂���o���J�n�ʒu</param>
//    /// <returns>�w�肳�ꂽ�o�C�g�ʒu�ȍ~�̂��ׂĂ̕�����</returns>
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
//    /// ������̎w�肳�ꂽ�o�C�g�ʒu����A�w�肳�ꂽ�o�C�g�����̕������Ԃ��܂�
//    /// </summary>
//    /// <param name="val">���o�����ɂȂ镶����</param>
//    /// <param name="start">0����n�܂���o���J�n�ʒu</param>
//    /// <param name="length">���o���o�C�g��</param>
//    /// <returns>�w�肳�ꂽ�o�C�g�ʒu����w�肳�ꂽ�o�C�g�����̕�����</returns>
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
//    /// ���p1�o�C�g�A�S�p2�o�C�g�Ƃ��āA�w�肳�ꂽ������̃o�C�g����Ԃ��܂�
//    /// </summary>
//    /// <param name="val">�o�C�g���擾�̑ΏۂƂȂ镶����</param>
//    /// <returns>���p1�o�C�g�A�S�p2�o�C�g�ŃJ�E���g���ꂽ�o�C�g��</returns>
//    /// <remarks></remarks>
//    public static int LengthBEx(String val) {
//        return System.Text.Encoding.GetEncoding("Shift_JIS").GetByteCount(val);
//    }
//
//    /// <summary>
//    /// String��Decimal�^�ɕϊ����Ԃ��܂��i�ϊ��o���Ȃ��ꍇ��0��Ԃ��j
//    /// </summary>
//    /// <param name="val">�ϊ�����String</param>
//    /// <returns>�ϊ����Decimal</returns>
//    /// <remarks></remarks>
//    public static Decimal ToDecimalEx(String val)
//    {
//        try
//        {
//            //Null�̏ꍇ��""��Ԃ�
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
//    /// �w�肵�����x�̐��l�Ɏl�̌ܓ����܂�
//    /// </summary>
//    /// <param name="val">�ۂߑΏۂ̔{���x���������_��</param>
//    /// <param name="digits">�߂�l�̗L�������̐��x</param>
//    /// <returns>digits�ɓ��������x�̐��l�Ɏl�̌ܓ����ꂽ���l</returns>
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
//    /// �w�肵�����x�̐��l�ɐ؂�グ���܂�
//    /// </summary>
//    /// <param name="val">�ۂߑΏۂ̔{���x���������_��</param>
//    /// <param name="digits">�߂�l�̗L�������̐��x</param>
//    /// <returns>digits�ɓ��������x�̐��l�ɐ؂�グ��ꂽ���l</returns>
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
//    /// �w�肵�����x�̐��l�ɐ؂�̂Ă��܂�
//    /// </summary>
//    /// <param name="val">�ۂߑΏۂ̔{���x���������_��</param>
//    /// <param name="digits">�߂�l�̗L�������̐��x</param>
//    /// <returns>digits�ɓ��������x�̐��l�ɐ؂�̂Ă�ꂽ���l</returns>
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
//    /// Object��DateTime?�^�ɕϊ����Ԃ��܂��i�ϊ��o���Ȃ��ꍇ��Null��Ԃ��j
//    /// </summary>
//    /// <param name="val">�ϊ�����Object</param>
//    /// <returns>�ϊ����DateTime?</returns>
//    /// <remarks></remarks>
//    public static DateTime? ToDateEx(this Object val)
//    {
//
//        try
//        {
//            //Null�̏ꍇ��""��Ԃ�
//            if (val == null)
//            {
//                return null;
//            }
//
//            //���t�ɕϊ��o���Ȃ��ꍇ��""��Ԃ�
//            DateTime ym = new DateTime();
//            if (DateTime.TryParse(val.toString(), out ym))
//            {
//                //�ϊ��o�����ꍇ�͎w��̏����ŕԂ�
//                return ym;
//            }
//            else
//            {
//                //�ϊ��o���Ȃ��ꍇ��""��Ԃ�
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
//    /// Object�����z������String�^�ɕϊ����Ԃ��܂��i�ϊ��o���Ȃ��ꍇ�͂��̂܂ܕԂ��j
//    /// </summary>
//    /// <param name="val">�ϊ�����Object</param>
//    /// <returns>�J���}�t��String</returns>
//    /// <remarks></remarks>
//    public static String ToAmountEx(Object val)
//    {
//
//        try
//        {
//            //Null�̏ꍇ��""��Ԃ�
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
//                //�ʉ݂ɕϊ��o���Ȃ��ꍇ�͂��̂܂܂̒l��Ԃ�
//                Decimal dc = new Decimal();
//                if (Decimal.TryParse(val.toString(), out dc))
//                {
//                    //�ϊ��o�����ꍇ�͎w��̏����ŕԂ�
//                    return dc.toString("#,0");
//                }
//                else
//                {
//                    //�ϊ��o���Ȃ��ꍇ�͂��̂܂܂̒l��Ԃ�
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
//    /// Object��Decimal�^�ɕϊ����Ԃ��܂��i�ϊ��o���Ȃ��ꍇ��0��Ԃ��j
//    /// </summary>
//    /// <param name="val">�ϊ�����Object</param>
//    /// <returns>�ϊ����Decimal</returns>
//    /// <remarks></remarks>
//    public static Decimal ToDecimalEx(this Object val)
//    {
//
//        try
//        {
//            //Null�̏ꍇ��0��Ԃ�
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
//                //�ʉ݂ɕϊ��o���Ȃ��ꍇ�͂��̂܂܂̒l��Ԃ�
//                Decimal dc = new Decimal();
//                if (Decimal.TryParse(val.toString(), out dc))
//                {
//                    //�ϊ��o�����ꍇ�͎w��̏����ŕԂ�
//                    return dc;
//                }
//                else
//                {
//                    //�ϊ��o���Ȃ��ꍇ�͂��̂܂܂̒l��Ԃ�
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
//    /// Object��int�^�ɕϊ����Ԃ��܂��i�ϊ��o���Ȃ��ꍇ��0��Ԃ��j
//    /// </summary>
//    /// <param name="val">�ϊ�����Object</param>
//    /// <returns>�ϊ����int</returns>
//    /// <remarks></remarks>
//    *//**
//     * @return
//     *//*
//    public static int ToIntlEx(Object val)
//    {
//        try
//        {
//            //Null�̏ꍇ��0��Ԃ�
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
//                //�ʉ݂ɕϊ��o���Ȃ��ꍇ��0��Ԃ�
//                int iVal = new int();
//                if (int.TryParse(val.toString(), out iVal))
//                {
//                    //�ϊ��o�����ꍇ�͎w��̏����ŕԂ�
//                    return iVal;
//                }
//                else
//                {
//                    //�ϊ��o���Ȃ��ꍇ�͂��̂܂܂̒l��Ԃ�
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
////    �G�F�F�F
//*//*
//    /// <summary>
//    /// ���t���w��̏����A���͋󔒂ɕϊ������l��Ԃ��܂�
//    /// </summary>
//    /// <param name="val">�ϊ�������t</param>
//    /// <param name="format">�ϊ����鏑���i�f�t�H���g="yyyyMMdd"�j</param>
//    /// <returns>�ϊ���̕�����</returns>
//    /// <remarks></remarks>
//    public static String toStringEx(DateTime val, String format = "yyyyMMdd")
//    {
//
//        try
//        {
//            //Null�̏ꍇ��""��Ԃ�
//            if (val == null)
//            {
//                return "";
//            }
//
//            //���t�ɕϊ��o���Ȃ��ꍇ��""��Ԃ�
//            DateTime ym = new DateTime();
//            if (DateTime.TryParse(val.Value.toString(), out ym))
//            {
//                //�ϊ��o�����ꍇ�͎w��̏����ŕԂ�
//                return ym.toString(format);
//            }
//            else
//            {
//                //�ϊ��o���Ȃ��ꍇ��""��Ԃ�
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
