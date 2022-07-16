package com.betty.controller.admin;

import com.betty.controller.admin.vo.Test;
import com.betty.controller.admin.vo.TestVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author betty
 * @date 2022/07/16
 */
@RestController
@RequestMapping("admin")
@Slf4j
public class AdminController {

    @GetMapping("test")
    public TestVO test(Test vo) {
        TestVO test = new TestVO();
        test.setDate(vo.getBegin());
        return test;
    }

    @PostMapping("test1")
    public TestVO test1(@RequestBody Test vo) {
        log.info("begin {}", vo.getBegin());
        log.info("end {}", vo.getEnd());
        TestVO test = new TestVO();
        test.setDate(vo.getBegin());
        return test;
    }

}
