/*
*@(#)CongTy.java.java  Nov 8, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.fit.ql;

import java.util.List;

import iuh.fit.cr.NhanVien;
import iuh.fit.cr.NhanVienKyThuat;

/*
* @description:
* @author: Chopper
* @date: Nov 8, 2023
* @version: 1.0
*/

/**
 * 
 */
public interface CongTy {
	boolean them(NhanVien tmp);
	boolean xoa(String ma);
	List<NhanVienKyThuat> trichdsnvkt();
	List<NhanVien> trichdsnv();
}
