package com.sskjdata.wms.consts;

import java.math.BigDecimal;

public class DbConst {

	/*拣货单执行的时候，生成批次，默认供应商编码为SUP0000624*/
	public static final String DEFAULT_SUPCODE ="SUP0000624";
	/*
	* 管理员角色暂定0*/
	public static final int SYSTEM_ROLEID = 0;
	
	public static final int typeMethod =  10300;
	/**
	 * 单据录入方式-表格导入
	 **/
	public static final int typeMethod_10301 = 10301;
	/**
	 * 单据录入方式-手动填写
	 **/
	public static final int typeMethod_10302 = 10302;
	/**
	 * 单据录入方式-自动同步
	 **/
	public static final int typeMethod_10303 = 10303;
	/**
	 * 单据录入方式-自动生成
	 **/
	public static final int typeMethod_10304 = 10304;


	public static final int epcStatus = 20100;
	/**
	 * 预到货单状态-草稿
	 **/
	public static final int epcStatus_20101 = 20101;
	/**
	 * 预到货单状态-未到货
	 **/
	public static final int epcStatus_20102 = 20102;
	/**
	 * 预到货单状态-已到货
	 **/
	public static final int epcStatus_20103 = 20103;


	public static final int epcDetailStatus = 20200;
	/**
	 * 预到货明细状态-草稿
	 **/
	public static final int epcDetailStatus_20201 = 20201;


	public static final int rcvStatus = 20300;
	/**
	 * 入库单状态-草稿
	 **/
	public static final int rcvStatus_20301 = 20301;
	/**
	 * 入库单状态-已审核
	 **/
	public static final int rcvStatus_20302 = 20302;
	/**
	 * 入库单状态-验收完成
	 **/
	public static final int rcvStatus_20303 = 20303;
	/**
	 * 入库单状态-上架完成
	 **/
	public static final int rcvStatus_20304 = 20304;
	/**
	 * 入库单状态-入库完成
	 **/
	public static final int rcvStatus_20305 = 20305;


	public static final int rcvDetailStatus = 20400;
	/**
	 * 入库单明细状态-草稿
	 **/
	public static final int rcvDetailStatus_20401 = 20401;
	/**
	 * 入库单明细状态-已验收
	 **/
	public static final int rcvDetailStatus_20402 = 20402;
	/**
	 * 入库单明细状态-已上架
	 **/
	public static final int rcvDetailStatus_20403 = 20403;
	/**
	 * 入库单明细状态-上架中
	 **/
	public static final int rcvDetailStatus_20404 = 20404;


	public static final int upcStatus = 20500;
	/**
	 * 上架单状态-上架中
	 **/
	public static final int upcStatus_20501 = 20501;
	/**
	 * 上架单状态-上架完成
	 **/
	public static final int upcStatus_20502 = 20502;


	public static final int upcDetailStatus = 20600;
	/**
	 * 上架单明细状态-未上架
	 **/
	public static final int upcDetailStatus_20601 = 20601;
	/**
	 * 上架单明细状态-已上架
	 **/
	public static final int upcDetailStatus_20602 = 20602;
	/**
	 * 上架单明细状态-已取消
	 **/
	public static final int upcDetailStatus_20603 = 20603;



	public static final int bckStatus = 20700;
	/**
	 * 销售退货单状态-草稿
	 **/
	public static final int bckStatus_20701 = 20701;
	/**
	 * 销售退货单状态-已审核
	 **/
	public static final int bckStatus_20702 = 20702;


	public static final int bckDetailStatus = 20800;
	/**
	 * 销售退货单明细状态-草稿
	 **/
	public static final int bckDetailStatus_20801 = 20801;


	public static final int epcType = 21100;
	/**
	 * 预到货单类型-采购预到货
	 **/
	public static final int epcType_21101 = 21101;
	/**
	 * 预到货单类型-调拨预到货
	 **/
	public static final int epcType_21102 = 21102;


	public static final int rcvType = 21200;
	/**
	 * 入库单类型-采购入库
	 **/
	public static final int rcvType_21201 = 21201;
	/**
	 * 入库单类型-退货入库
	 **/
	public static final int rcvType_21202 = 21202;
	/**
	 * 入库单类型-报增入库
	 **/
	public static final int rcvType_21203 = 21203;
	/**
	 * 入库单类型-盘盈入库
	 **/
	public static final int rcvType_21204 = 21204;
	/**
	 * 入库单类型-调拨入库
	 **/
	public static final int rcvType_21205 = 21205;
	/**
	 * 入库单类型-直接入库
	 **/
	public static final int rcvType_21206 = 21206;
	/**
	 * 入库单类型-成品入库
	 **/
	public static final int rcvType_21207 = 21207;


	public static final int slcStatus = 30100;
	/**
	 * 销售单状态-草稿
	 **/
	public static final int slcStatus_30101 = 30101;
	/**
	 * 销售单状态-已审核
	 **/
	public static final int slcStatus_30102 = 30102;

	public static final int slcDetailStatus = 30200;
	/**
	 * 销售单明细状态-草稿
	 **/
	public static final int slcDetailStatus_30202 = 30202;


	public static final int soStatus = 30300;
	/**
	 * 出库单状态-草稿
	 **/
	public static final int soStatus_30301 = 30301;
	/**
	 * 出库单状态-已配货
	 **/
	public static final int soStatus_30302 = 30302;
	/**
	 * 出库单状态-拣货完成
	 **/
	public static final int soStatus_30303 = 30303;
	/**
	 * 出库单状态-出库完成
	 **/
	public static final int soStatus_30304 = 30304;

	public static final int soDetailStatus = 30400;
	/**
	 * 出库单明细状态-草稿
	 **/
	public static final int soDetailStatus_30401 = 30401;
	/**
	 * 出库单明细状态-配货完成
	 **/
	public static final int soDetailStatus_30402 = 30402;
	/**
	 * 出库单明细状态-拣货完成
	 **/
	public static final int soDetailStatus_30403 = 30403;
	/**
	 * 出库单明细状态-已取消
	 **/
	public static final int soDetailStatus_30404 = 30404;


	public static final int pikStatus = 30500;
	/**
	 * 拣货单状态-拣货中
	 **/
	public static final int pikStatus_30501 = 30501;
	/**
	 * 拣货单状态-拣货完成
	 **/
	public static final int pikStatus_30502 = 30502;


	public static final int pikDetailStatus = 30600;
	/**
	 * 拣货单明细状态-未拣货
	 **/
	public static final int pikDetailStatus_30601 = 30601;
	/**
	 * 拣货单明细状态-已拣货
	 **/
	public static final int pikDetailStatus_30602 = 30602;

	/**
	 * 拣货单明细状态-已取消
	 **/
	public static final int pikDetailStatus_30603 = 30603;


	public static final int prcStatus = 30700;
	/**
	 * 采购退货单状态-草稿
	 **/
	public static final int prcStatus_30701 = 30701;
	/**
	 * 采购退货单状态-已审核
	 **/
	public static final int prcStatus_30702 = 30702;


	public static final int prcDetailStatus = 30800;
	/**
	 * 采购退货单明细状态-草稿
	 **/
	public static final int prcDetailStatus_30801 = 30801;


	public static final int soType = 31100;
	/**
	 * 出库单类型-销售出库
	 **/
	public static final int soType_31101 = 31101;
	/**
	 * 出库单类型-退货出库
	 **/
	public static final int soType_31102 = 31102;
	/**
	 * 出库单类型-报损出库
	 **/
	public static final int soType_31103 = 31103;
	/**
	 * 出库单类型-调拨出库
	 **/
	public static final int soType_31104 = 31104;
	/**
	 * 出库单类型-盘亏出库
	 **/
	public static final int soType_31105 = 31105;
	/**
	 * 出库单类型-直接出库
	 **/
	public static final int soType_31106 = 31106;


	public static final int apcStatus = 40100;
	/**
	 * 调拨单状态-草稿
	 **/
	public static final int apcStatus_40101 = 40101;
	/**
	 * 调拨单状态-已审核
	 **/
	public static final int apcStatus_40102 = 40102;


	public static final int apcDetailStatus = 40200;
	/**
	 * 调拨单明细状态-草稿
	 **/
	public static final int apcDetailStatus_40201 = 40201;


	public static final int mvcStatus = 40300;
	/**
	 * 货位移动单状态-草稿
	 **/
	public static final int mvcStatus_40301 = 40301;
	/**
	 * 货位移动单状态-已审核
	 **/
	public static final int mvcStatus_40302 = 40302;
	/**
	 * 货位移动单状态-移动完成
	 **/
	public static final int mvcStatus_40303 = 40303;


	public static final int mvcDetailStatus = 40400;
	/**
	 * 货位移动单明细状态-未执行
	 **/
	public static final int mvcDetailStatus_40401 = 40401;
	/**
	 * 货位移动单明细状态-已执行
	 **/
	public static final int mvcDetailStatus_40402 = 40402;

	/**
	 * 货位移动单明细状态-取消
	 **/
	public static final int mvcDetailStatus_40403 = 40403;

	public static final int apcType = 41100;
	/**
	 * 调拨单类型-调拨单
	 **/
	public static final int apcType_41101 = 41101;
	/**
	 * 移动单类型-移动单
	 **/
	public static final int mvcType_41201 = 41201;

	public static final int invStatus = 50100;
	/**
	 * 盘点单状态-草稿
	 **/
	public static final int invStatus_50101 = 50101;
	/**
	 * 盘点单状态-盘点完成
	 **/
	public static final int invStatus_50102 = 50102;
	/**
	 * 盘点单状态-已结存
	 **/
	public static final int invStatus_50103 = 50103;

	public static final int proStatus = 60100;
	/**
	 * 生产计划单-草稿
	 */
	public static final int proStatus_60101 = 60101;
	/**
	 * 生产计划单-已审核
	 */
	public static final int proStatus_60102 = 60102;
	/**
	 * 生产计划单-已完成
	 */
	public static final int proStatus_60103 = 60103;

	/**
	 * 生产计划原料-草稿
	 */
	public static final int proStatus_60201 = 60201;
	/**
	 * 生产计划原料-已审核
	 */
	public static final int proStatus_60202 = 60202;
	/**
	 * 生产计划原料-已完成
	 */
	public static final int proStatus_60203 = 60203;

	/**
	 * 生产计划成品-草稿
	 */
	public static final int proStatus_60301 = 60301;
	/**
	 * 生产计划成品-已审核
	 */
	public static final int proStatus_60302 = 60302;
	/**
	 * 生产计划成品-已完成
	 */
	public static final int proStatus_60303 = 60303;



	public static final int proStatus_70100 = 70100;
	/**
	 * 领料单-草稿
	 */
	public static final int proStatus_70101 = 70101;
	/**
	 * 领料单-未领取
	 */
	public static final int proStatus_70102 = 70102;
	/**
	 * 领料单-已领取
	 */
	public static final int proStatus_70103 = 70103;
	/**
	 * 领料单-已完成
	 */
	public static final int getProStatus_70104 = 70104;

	/**
	 * 领料单明细-草稿
	 */
	public static final int proStatus_70201 = 70201;
	/**
	 * 领料单明细-未领取
	 */
	public static final int proStatus_70202 = 70202;
	/**
	 * 领料单明细-已领取
	 */
	public static final int proStatus_70203 = 70203;

	/**
	 * 领料记录-草稿
	 */
	public static final int proStatus_70301 = 70201;
	/**
	 * 领料记录-未领取
	 */
	public static final int proStatus_70302 = 70202;
	/**
	 * 领料记录-已领取
	 */
	public static final int proStatus_70303 = 70203;



	public static final int proStatus_80100 = 80100;
	/**
	 * 余料返库单-草稿
	 */
	public static final int proStatus_80101 = 80101;

	/**
	 * 余料返库单-已审核
	 */
	public static final int proStatus_80102 = 80102;

	/**
	 * 余料返库明细-草稿
	 */
	public static final int proStatus_80201 = 80201;

	/**
	 * 余料返库明细-已审核
	 */
	public static final int proStatus_80202 = 80202;

	/**
	 * 余料返库记录-草稿
	 */
	public static final int proStatus_80301 = 80301;

	/**
	 * 余料返库记录-已返库
	 */
	public static final int proStatus_80302 = 80302;



	public static final int proStatus_90100 = 90100;
	/**
	 * 成品入库单-草稿
	 */
	public static final int proStatus_90101 = 90101;
	/**
	 * 成品入库单-已审核
	 */
	public static final int proStatus_90102 = 90102;
	/**
	 * 成品入库原料-草稿
	 */
	public static final int proStatus_90201 = 90201;
	/**
	 * 成品入库原料-已审核
	 */
	public static final int proStatus_90202 = 90202;
	/**
	 * 成品入库成品-草稿
	 */
	public static final int proStatus_90301 = 90301;
	/**
	 * 成品入库成品-已入库
	 */
	public static final int proStatus_90302 = 90302;


	public static final int proStatus_11100 = 11100;
	/**
	 * 加工配货单-草稿
	 */
	public static final int proStatus_11101 = 11101;
	/**
	 * 加工配货单-已完成
	 */
	public static final int proStatus_11102 = 11102;

	/**
	 * 加工配货单明细-草稿
	 */
	public static final int proStatus_11201 = 11201;
	/**
	 *加工配货单明细-已完成
	 */
	public static final int proStatus_11202 = 11202;

	/**
	 * 加工配货单记录-草稿
	 */
	public static final int proStatus_11301 = 11301;
	/**
	 * 加工配货单记录-已完成
	 */
	public static final int proStatus_11302 = 11302;


	public static final int barStatus_12100 = 12100;

	/**
	 * 白条记录草稿
	 */
	public static final int barStatus_12101 = 12101;

	/**
	 * 白条记录已验收
	 */
	public static final int barStatus_12102 = 12102;

	/**
	 * 白条记录已上架
	 */
	public static final int barStatus_12103 = 12103;


	public static final int zhStatus_13100 = 13100;

	/**
	 * 形态转换草稿
	 */
	public static final int zhStatus_13101 = 13101;

	/**
	 * 形态转换已审核
	 */
	public static final int zhStatus_13102 = 13102;

	/**
	 * 形态转换明细草稿
	 */
	public static final int zhStatus_13201 = 13201;

	/**
	 * 形态转换明细已审核
	 */
	public static final int zhStatus_13202 = 13202;


	public static final int zhStatus_13300 = 13300;
	/**
	 * 形态转换明细类型-原料
	 */
	public static final int zhType_13301 = 13301;

	/**
	 * 形态转换明细类型-成品
	 */
	public static final int zhType_13302 = 13302;


	/**
	 * 盘点方式-全盘
	 **/
	public static final int invMethod_50301 = 50301;
	/**
	 * 盘点方式-部分盘点
	 **/
	public static final int invMethod_50302 = 50302;

	public static final int invDetailStatus = 50200;
	/**
	 * 盘点明细状态-未盘点
	 **/
	public static final int invDetailStatus_50201 = 50201;
	/**
	 * 盘点明细状态-已盘点
	 **/
	public static final int invDetailStatus_50202 = 50202;

	/**
	 * 盘盈明细
	 */
	public static final int invDetailType_1=1;

	/**
	 * 盘亏明细
	 */
	public static final int invDetailType_2=2;

	/**
	 * 未删除
	 **/
	public static final Integer NO_DELETE=0;
	/**
	 * 已删除
	 **/
	public static final Integer IS_DELETE=1;

	/**
	 * 数量0
	 **/
	public static final Integer SIZE_ZERO=0;

	/**
	 * 数量10
	 **/
	public static final Integer SIZE_TEN=10;

	/**
	 * 数量1
	 **/
	public static final Integer SIZE_ONE=1;

	/**
	 * 数量2
	 **/
	public static final Integer SIZE_TWO=2;

	/**
	 * 数量3
	 **/
	public static final Integer SIZE_THREE=3;
	/**
	 * 默认冻结库存
	 */
	public static final BigDecimal DEF_ALLOCATED_QTY=BigDecimal.ZERO;
	public static final Integer size=0;

	/**
	 * 配货策略
	 */
	public static final Integer AllocStrategy = 60100;

	/**
	 * 指定批次
	 */
	public static final Integer AllocStrategy_AssignBatch = 60101;

	/**
	 * 近效期优先
	 */
	public static final Integer AllocStrategy_ExpFirst = 60102;

	/**
	 * 远效期优先
	 */
	public static final Integer AllocStrategy_ExpLast = 60103;

	/**
	 * 低成本优先
	 */
	public static final Integer AllocStrategy_PriceFirst = 60104;

	/**
	 * 高成本优先
	 */
	public static final Integer AllocStrategy_PriceLast = 60105;

	/**
	 * 先进先出
	 */
	public static final Integer AllocStrategy_FIFO=60106;

	/**
	 * 指定供应商
	 */
	public static final Integer AllocStrategy_AssignSup=60107;

	//菜单类型(用以区分菜单表数据类型)
	//菜单
	public static final Integer menu_type_14101=14101;
	//页面
	public static final Integer menu_type_14102=14102;
	//按钮
	public static final Integer menu_type_14103=14103;

	//商品分类层级代码
	public static final Integer CategoryLevel_1=1;

	public static final Integer CategoryLevel_2=2;

	public static final String UTF8 = "utf-8";

	//详情默认id
	public static final Long DEFAULT_CID=0L;

	//mysql数据可保存的最大时间
	public static final String MYSQL_MAX_TIME="9999-12-31 11:59:59";

	public static final String CLIENT_MOBILE="来自手持端";

	//pc端标识
	public static final Integer platform_1=1;
	//pda标识
	public static final Integer platform_2=2;

	//pc菜单id
	public static final String PC_ID="1";
	//pda菜单id
	public static final String PDA_ID="2";

	//pc菜单名称
	public static final String PC_NAME="PC";
	//pda菜单名称
	public static final String PDA_NAME="PDA";


	//是否系统补全菜单
	public static final Integer IS_MAKE_UP=1;



}
