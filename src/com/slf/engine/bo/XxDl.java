package com.slf.engine.bo;

import java.math.BigDecimal;

import com.slf.engine.base.BaseObj;
import com.slf.engine.utils.DateUtils;


public class XxDl extends BaseObj {
	private String dtmmkqzt;
	private String dtmm;
	private String qhdm;
	private String qhdms;
	private String qhdmq;
	private String remcheck;
	private String hzm;
	private String lxr;		
	private String wgyhbz;
	public String getWgyhbz() {
		return wgyhbz;
	}

	public void setWgyhbz(String wgyhbz) {
		this.wgyhbz = wgyhbz;
	}

	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getDtmmkqzt() {
		return dtmmkqzt;
	}

	public void setDtmmkqzt(String dtmmkqzt) {
		this.dtmmkqzt = dtmmkqzt;
	}

	public String getDtmm() {
		return dtmm;
	}

	public void setDtmm(String dtmm) {
		this.dtmm = dtmm;
	}

	public String getHzm() {
		return hzm;
	}

	public void setHzm(String hzm) {
		this.hzm = hzm;
	}

	private String qhmc;
	
	public String getRemcheck() {
		return remcheck;
	}

	public void setRemcheck(String remcheck) {
		this.remcheck = remcheck;
	}

	public String getQhmc() {
		return qhmc;
	}

	public void setQhmc(String qhmc) {
		this.qhmc = qhmc;
	}

	public String getQhdms() {
		return qhdms;
	}

	public void setQhdms(String qhdms) {
		this.qhdms = qhdms;
	}

	public String getQhdmq() {
		return qhdmq;
	}

	public void setQhdmq(String qhdmq) {
		this.qhdmq = qhdmq;
	}

	public String getQhdm() {
		return qhdm;
	}

	public void setQhdm(String qhdm) {
		this.qhdm = qhdm;
	}

	private String startDate;
	private String endDate;
	
    public String getStartDate() {
    	if(startDate == null)
    	{
    		return  DateUtils.strDate("yyyy-MM-dd");
    	}
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		if(endDate == null)
    	{
    		return  DateUtils.strDate("yyyy-MM-dd");
    	}
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	private BigDecimal ydjg;
	private BigDecimal ltjg;
	private BigDecimal dxjg;
	private BigDecimal nrzs;
	
	
	public BigDecimal getYdjg() {
		return ydjg;
	}

	public void setYdjg(BigDecimal ydjg) {
		this.ydjg = ydjg;
	}

	public BigDecimal getLtjg() {
		return ltjg;
	}

	public void setLtjg(BigDecimal ltjg) {
		this.ltjg = ltjg;
	}

	public BigDecimal getDxjg() {
		return dxjg;
	}

	public void setDxjg(BigDecimal dxjg) {
		this.dxjg = dxjg;
	}

	public BigDecimal getNrzs() {
		return nrzs;
	}

	public void setNrzs(BigDecimal nrzs) {
		this.nrzs = nrzs;
	}

	private String qdlmm;
	private String xdlmm;
	private String xjymm;
	private String qjymm;
	private BigDecimal je;
	private BigDecimal hrje;
	private BigDecimal hcje;
	private String hzsj;
	
	
	public BigDecimal getHcje() {
		return hcje;
	}

	public void setHcje(BigDecimal hcje) {
		this.hcje = hcje;
	}

	public BigDecimal getHrje() {
		return hrje;
	}

	public void setHrje(BigDecimal hrje) {
		this.hrje = hrje;
	}

	public String getHzsj() {
		return hzsj;
	}

	public void setHzsj(String hzsj) {
		this.hzsj = hzsj;
	}

	public BigDecimal getJe() {
		return je;
	}

	public void setJe(BigDecimal je) {
		this.je = je;
	}

	public String getQdlmm() {
		return qdlmm;
	}

	public void setQdlmm(String qdlmm) {
		this.qdlmm = qdlmm;
	}

	public String getXdlmm() {
		return xdlmm;
	}

	public void setXdlmm(String xdlmm) {
		this.xdlmm = xdlmm;
	}

	public String getXjymm() {
		return xjymm;
	}

	public void setXjymm(String xjymm) {
		this.xjymm = xjymm;
	}

	public String getQjymm() {
		return qjymm;
	}

	public void setQjymm(String qjymm) {
		this.qjymm = qjymm;
	}

	private String verifycode;
    public String getVerifycode() {
		return verifycode;
	}

	public void setVerifycode(String verifycode) {
		this.verifycode = verifycode;
	}

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.DLID
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private Long dlid;
    private Long xmid;
    private Long zhid;
    

    public Long getXmid() {
		return xmid;
	}

	public void setXmid(Long xmid) {
		this.xmid = xmid;
	}

	public Long getZhid() {
		return zhid;
	}

	public void setZhid(Long zhid) {
		this.zhid = zhid;
	}

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.SJDLID
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private Long sjdlid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.CPBZ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private Short cpbz;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.ZHM
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String zhm;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.DLLB
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String dllb;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.DLMC
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String dlmc;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.SFZH
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String sfzh;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.XB
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String xb;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.LXFS
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String lxfs;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.CSRQ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String csrq;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.LXDH
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String lxdh;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.LXDZ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String lxdz;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.SSDQ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String ssdq;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.DLMM
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String dlmm;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.JYMM
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String jymm;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.MBWT
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String mbwt;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.MBDA
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String mbda;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.DZYX
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String dzyx;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.DJRQ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String djrq;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.DJSJ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String djsj;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.DJRLB
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String djrlb;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.DJRID
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private Long djrid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.ZXRQ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String zxrq;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.ZXSJ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String zxsj;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.ZXYY
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String zxyy;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.ZXRID
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private Long zxrid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.ZT
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String zt;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.BZ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String bz;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column XX_DL.DLM
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    private String dlm;
    
    private Long jsid;

    public Long getJsid() {
		return jsid;
	}

	public void setJsid(Long jsid) {
		this.jsid = jsid;
	}

	/**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.DLID
     *
     * @return the value of XX_DL.DLID
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public Long getDlid() {
        return dlid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.DLID
     *
     * @param dlid the value for XX_DL.DLID
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setDlid(Long dlid) {
        this.dlid = dlid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.SJDLID
     *
     * @return the value of XX_DL.SJDLID
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public Long getSjdlid() {
        return sjdlid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.SJDLID
     *
     * @param sjdlid the value for XX_DL.SJDLID
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setSjdlid(Long sjdlid) {
        this.sjdlid = sjdlid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.CPBZ
     *
     * @return the value of XX_DL.CPBZ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public Short getCpbz() {
        return cpbz;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.CPBZ
     *
     * @param cpbz the value for XX_DL.CPBZ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setCpbz(Short cpbz) {
        this.cpbz = cpbz;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.ZHM
     *
     * @return the value of XX_DL.ZHM
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getZhm() {
        return zhm;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.ZHM
     *
     * @param zhm the value for XX_DL.ZHM
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setZhm(String zhm) {
        this.zhm = zhm == null ? null : zhm.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.DLLB
     *
     * @return the value of XX_DL.DLLB
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getDllb() {
        return dllb;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.DLLB
     *
     * @param dllb the value for XX_DL.DLLB
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setDllb(String dllb) {
        this.dllb = dllb == null ? null : dllb.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.DLMC
     *
     * @return the value of XX_DL.DLMC
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getDlmc() {
        return dlmc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.DLMC
     *
     * @param dlmc the value for XX_DL.DLMC
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setDlmc(String dlmc) {
        this.dlmc = dlmc == null ? null : dlmc.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.SFZH
     *
     * @return the value of XX_DL.SFZH
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getSfzh() {
        return sfzh;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.SFZH
     *
     * @param sfzh the value for XX_DL.SFZH
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setSfzh(String sfzh) {
        this.sfzh = sfzh == null ? null : sfzh.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.XB
     *
     * @return the value of XX_DL.XB
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getXb() {
        return xb;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.XB
     *
     * @param xb the value for XX_DL.XB
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setXb(String xb) {
        this.xb = xb == null ? null : xb.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.LXFS
     *
     * @return the value of XX_DL.LXFS
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getLxfs() {
        return lxfs;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.LXFS
     *
     * @param lxfs the value for XX_DL.LXFS
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setLxfs(String lxfs) {
        this.lxfs = lxfs == null ? null : lxfs.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.CSRQ
     *
     * @return the value of XX_DL.CSRQ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getCsrq() {
        return csrq;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.CSRQ
     *
     * @param csrq the value for XX_DL.CSRQ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setCsrq(String csrq) {
        this.csrq = csrq == null ? null : csrq.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.LXDH
     *
     * @return the value of XX_DL.LXDH
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getLxdh() {
        return lxdh;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.LXDH
     *
     * @param lxdh the value for XX_DL.LXDH
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setLxdh(String lxdh) {
        this.lxdh = lxdh == null ? null : lxdh.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.LXDZ
     *
     * @return the value of XX_DL.LXDZ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getLxdz() {
        return lxdz;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.LXDZ
     *
     * @param lxdz the value for XX_DL.LXDZ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setLxdz(String lxdz) {
        this.lxdz = lxdz == null ? null : lxdz.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.SSDQ
     *
     * @return the value of XX_DL.SSDQ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getSsdq() {
        return ssdq;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.SSDQ
     *
     * @param ssdq the value for XX_DL.SSDQ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setSsdq(String ssdq) {
        this.ssdq = ssdq == null ? null : ssdq.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.DLMM
     *
     * @return the value of XX_DL.DLMM
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getDlmm() {
        return dlmm;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.DLMM
     *
     * @param dlmm the value for XX_DL.DLMM
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setDlmm(String dlmm) {
        this.dlmm = dlmm == null ? null : dlmm.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.JYMM
     *
     * @return the value of XX_DL.JYMM
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getJymm() {
        return jymm;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.JYMM
     *
     * @param jymm the value for XX_DL.JYMM
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setJymm(String jymm) {
        this.jymm = jymm == null ? null : jymm.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.MBWT
     *
     * @return the value of XX_DL.MBWT
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getMbwt() {
        return mbwt;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.MBWT
     *
     * @param mbwt the value for XX_DL.MBWT
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setMbwt(String mbwt) {
        this.mbwt = mbwt == null ? null : mbwt.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.MBDA
     *
     * @return the value of XX_DL.MBDA
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getMbda() {
        return mbda;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.MBDA
     *
     * @param mbda the value for XX_DL.MBDA
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setMbda(String mbda) {
        this.mbda = mbda == null ? null : mbda.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.DZYX
     *
     * @return the value of XX_DL.DZYX
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getDzyx() {
        return dzyx;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.DZYX
     *
     * @param dzyx the value for XX_DL.DZYX
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setDzyx(String dzyx) {
        this.dzyx = dzyx == null ? null : dzyx.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.DJRQ
     *
     * @return the value of XX_DL.DJRQ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getDjrq() {
        return djrq;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.DJRQ
     *
     * @param djrq the value for XX_DL.DJRQ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setDjrq(String djrq) {
        this.djrq = djrq == null ? null : djrq.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.DJSJ
     *
     * @return the value of XX_DL.DJSJ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getDjsj() {
        return djsj;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.DJSJ
     *
     * @param djsj the value for XX_DL.DJSJ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setDjsj(String djsj) {
        this.djsj = djsj == null ? null : djsj.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.DJRLB
     *
     * @return the value of XX_DL.DJRLB
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getDjrlb() {
        return djrlb;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.DJRLB
     *
     * @param djrlb the value for XX_DL.DJRLB
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setDjrlb(String djrlb) {
        this.djrlb = djrlb == null ? null : djrlb.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.DJRID
     *
     * @return the value of XX_DL.DJRID
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public Long getDjrid() {
        return djrid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.DJRID
     *
     * @param djrid the value for XX_DL.DJRID
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setDjrid(Long djrid) {
        this.djrid = djrid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.ZXRQ
     *
     * @return the value of XX_DL.ZXRQ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getZxrq() {
        return zxrq;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.ZXRQ
     *
     * @param zxrq the value for XX_DL.ZXRQ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setZxrq(String zxrq) {
        this.zxrq = zxrq == null ? null : zxrq.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.ZXSJ
     *
     * @return the value of XX_DL.ZXSJ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getZxsj() {
        return zxsj;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.ZXSJ
     *
     * @param zxsj the value for XX_DL.ZXSJ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setZxsj(String zxsj) {
        this.zxsj = zxsj == null ? null : zxsj.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.ZXYY
     *
     * @return the value of XX_DL.ZXYY
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getZxyy() {
        return zxyy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.ZXYY
     *
     * @param zxyy the value for XX_DL.ZXYY
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setZxyy(String zxyy) {
        this.zxyy = zxyy == null ? null : zxyy.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.ZXRID
     *
     * @return the value of XX_DL.ZXRID
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public Long getZxrid() {
        return zxrid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.ZXRID
     *
     * @param zxrid the value for XX_DL.ZXRID
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setZxrid(Long zxrid) {
        this.zxrid = zxrid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.ZT
     *
     * @return the value of XX_DL.ZT
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getZt() {
        return zt;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.ZT
     *
     * @param zt the value for XX_DL.ZT
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.BZ
     *
     * @return the value of XX_DL.BZ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getBz() {
        return bz;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.BZ
     *
     * @param bz the value for XX_DL.BZ
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column XX_DL.DLM
     *
     * @return the value of XX_DL.DLM
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public String getDlm() {
        return dlm;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column XX_DL.DLM
     *
     * @param dlm the value for XX_DL.DLM
     *
     * @ibatorgenerated Mon Feb 18 10:35:28 CST 2013
     */
    public void setDlm(String dlm) {
        this.dlm = dlm == null ? null : dlm.trim();
    }
    
    private String sss;//所属省

	public String getSss() {
		return sss;
	}
	public void setSss(String sss) {
		this.sss = sss;
	}

    
}