package com.nes.soap.smart;

import com.nes.soap.config.DateAudit;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class SmartItem extends DateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * EQPMN_CODE
     * 장비코드
     */
    private String eqpmnCode;

    /**
     * EQPMN_ESNTL_SN
     * 장비고유일련번호
     */
    private String eqpmnEsntlSn;

    /**
     * EQPMN_NO
     * 장비번호
     */
    private String eqpmnNo;

    /**
     * ITEM_CODE
     * 축종코드
     */
    private String itemCode;

    /**
     * LSIND_REGIST_NO
     * 축산업등록번호
     */
    private String lsindRegistNo;

    /**
     * MAKR_ID
     * 제조사 아이디
     */
    private String makrId;

    /**
     * ROOM_DTL_NO
     * 칸번호(명)
     */
    private String roomDtlNo;

    /**
     * ROOM_NO
     * 방번호(명)
     */
    private String roomNo;

    /**
     * STALL_NO
     * 축사번호(명)
     */
    private String stallNo;

    /**
     * STALL_TY_CODE
     * 축사유형코드
     */
    private String stallTyCode;
}
