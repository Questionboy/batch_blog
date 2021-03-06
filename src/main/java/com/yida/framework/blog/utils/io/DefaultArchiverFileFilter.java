package com.yida.framework.blog.utils.io;

import java.io.File;
import java.io.IOException;

/**
 * @Author Lanxiaowei
 * @Date 2018-01-14 21:33
 * @Description ArchiverFileFilter的默认实现
 */
public class DefaultArchiverFileFilter extends ArchiverFileFilter {

    @Override
    public boolean doArchiver(File[] srcFiles, String destpath) throws IOException {
        return false;
    }

    @Override
    public boolean doUnArchiver(File srcfile, String destpath) throws IOException {
        return false;
    }
}
