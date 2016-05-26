package com.bjw.bean;

import java.io.Serializable;

/**
 * @author
 *用于保存界面数据
 */
public class AssistBean implements Serializable{
	private static final long serialVersionUID = -5620661009186692227L;
	private boolean isTxt=true;
	private String SendTxtA="COMA",SendTxtB="COMB",SendTxtC="COMC",SendTxtD="COMD";
	private String SendHexA="AA",SendHexB="BB",SendHexC="CC",SendHexD="DD";
	public String sTimeA="500";
	public String sTimeB="500";
	public String sTimeC="500";
	public String sTimeD="500";
	public boolean isTxt()
	{
		return isTxt;
	}
	public void setTxtMode(boolean isTxt)
	{
		this.isTxt = isTxt;
	}

	public String getSendA()
	{
		if (isTxt)
		{
			return SendTxtA;
		} else
		{
			return SendHexA;
		}
	}
	public String getSendB()
	{
		if (isTxt)
		{
			return SendTxtB;
		} else
		{
			return SendHexB;
		}
	}
	public String getSendC()
	{
		if (isTxt)
		{
			return SendTxtC;
		} else
		{
			return SendHexC;
		}
	}
	public String getSendD()
	{
		if (isTxt)
		{
			return SendTxtD;
		} else
		{
			return SendHexD;
		}
	}

	public void setSendA(String sendA)
	{
		if (isTxt)
		{
			SendTxtA = sendA;
		} else
		{
			SendHexA = sendA;
		}
	}

	public void setSendB(String sendB)
	{
		if (isTxt)
		{
			SendTxtB = sendB;
		} else
		{
			SendHexB = sendB;
		}
	}

	public void setSendC(String sendC)
	{
		if (isTxt)
		{
			SendTxtC = sendC;
		} else
		{
			SendHexC = sendC;
		}
	}

	public void setSendD(String sendD)
	{
		if (isTxt)
		{
			SendTxtD = sendD;
		} else
		{
			SendHexD = sendD;
		}
	}
}