package com.qf.controller;

import com.google.gson.internal.$Gson$Preconditions;
import com.qf.constant.SystemConstant;
import com.qf.pojo.ReceverAddressInfo;
import com.qf.service.ReceverAddressInfoService;
import com.qf.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "收货地址管理")
@RestController
@RequestMapping("api/ReceverAddressInfo/")
public class ReceverAddressInfoController {
    @Autowired
    private ReceverAddressInfoService service;

    /**
     * 通过编号查询收货地址
     * @param uid
     * @return
     */
    @ApiOperation(value = "通过编号查询id" ,notes = "通过编号查询id")
    @PostMapping("selectByUid/{uid}")
    public R selectByUid(@PathVariable int uid) {
        return service.selectByUid(uid);
    }

    /**
     * 添加收货地址
     * @param receverAddressInfo
     * @return
     */
    @ApiOperation(value = "添加收货地址",notes = "添加收货地址")
    @PostMapping("insert")
    public R insert(ReceverAddressInfo receverAddressInfo) {
        return R.ok(service.insert(receverAddressInfo));
    }

    /**
     * 修改收货地址
     * @param receverAddressInfo
     * @return
     */
    @ApiOperation(value = "修改收货地址",notes = "修改收货地址")
    @PostMapping("updateAddress")
    public R updateAddress(ReceverAddressInfo receverAddressInfo) {
        return service.updateAddress(receverAddressInfo);
    }

    /**
     * 根据编号删除收货地址
     * @param id
     * @return
     */
    @ApiOperation(value = "删除收货地址",notes = "删除收货地址")
    @PostMapping("deleteAddress")
    public R deleteAddress(int id){
        return R.ok(service.delete(id));
    }
}
