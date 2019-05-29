package cc.mrbird.febs.wx.service.impl;

import cc.mrbird.febs.wx.entity.Test;
import cc.mrbird.febs.wx.mapper.TestMapper;
import cc.mrbird.febs.wx.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author MrBird
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
