package org.jypj.dev.vo;

/**
 * @author yu_chen
 **/
public class BasePackage implements Cloneable {

    /**
     * 生成的文件路径
     */
    private String filePath;
    /**
     * 基类包名称
     */
    private String basePackageName;
    /**
     * 对应的模板命成分
     */
    private String ftlName;
    /**
     * 生成的文件名
     */
    private String fileName;
    /**
     * 完整的包名
     */
    private String packageName;

    /**
     * 文件名对应的类名
     */
    private String clazzName;


    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getBasePackageName() {
        return basePackageName;
    }

    public void setBasePackageName(String basePackageName) {
        this.basePackageName = basePackageName;
    }

    public String getFtlName() {
        return ftlName;
    }

    public void setFtlName(String ftlName) {
        this.ftlName = ftlName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    @Override
    public BasePackage clone() {
        BasePackage basePackage = null;
        try {
            basePackage = (BasePackage) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return basePackage;
    }

    @Override
    public String toString() {
        return "BasePackage{" +
                "filePath='" + filePath + '\'' +
                ", basePackageName='" + basePackageName + '\'' +
                ", ftlName='" + ftlName + '\'' +
                ", fileName='" + fileName + '\'' +
                ", packageName='" + packageName + '\'' +
                ", clazzName='" + clazzName + '\'' +
                '}';
    }
}
