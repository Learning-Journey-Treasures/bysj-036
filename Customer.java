package com.cn.hnust.pojo;

public class Customer {
    private Integer id;

    private String cname;

    private Integer cage;

    private String csex;

    private Integer csno;

    private String cslogen;

    private String ctime;

    private String cclass;
    
    private String copenid;
    
    private String xuehao;
    
    private Integer status;
    
    private String pwd;
    
    public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getxuehao() {
		return xuehao;
	}

	public void setxuehao(String xuehao) {
		this.xuehao = xuehao;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCopenid() {
		return copenid;
	}

	public void setCopenid(String copenid) {
		this.copenid = copenid;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Integer getCage() {
        return cage;
    }

    public void setCage(Integer cage) {
        this.cage = cage;
    }

    public String getCsex() {
        return csex;
    }

    public void setCsex(String csex) {
        this.csex = csex == null ? null : csex.trim();
    }

    public Integer getCsno() {
        return csno;
    }

    public void setCsno(Integer csno) {
        this.csno = csno;
    }

    public String getCslogen() {
        return cslogen;
    }

    public void setCslogen(String cslogen) {
        this.cslogen = cslogen == null ? null : cslogen.trim();
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public String getCclass() {
        return cclass;
    }

    public void setCclass(String cclass) {
        this.cclass = cclass == null ? null : cclass.trim();
    }
}