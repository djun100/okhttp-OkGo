package com.lzy.demo.model;

/**
 * Created by cy on 2017/12/28.
 */

public class BaseBean {

    /**
     * data : {"access_key":"nb2cdshz","content":{"text":"哈喽，小汪很高兴为您服务，有什么问题我可以帮助您的呢？"}}
     * success : true
     * timestamp : 1514429595198
     */

    private DataBean data;
    private boolean success;
    private long timestamp;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public static class DataBean {
        /**
         * access_key : nb2cdshz
         * content : {"text":"哈喽，小汪很高兴为您服务，有什么问题我可以帮助您的呢？"}
         */

        private String access_key;
        private ContentBean content;

        public String getAccess_key() {
            return access_key;
        }

        public void setAccess_key(String access_key) {
            this.access_key = access_key;
        }

        public ContentBean getContent() {
            return content;
        }

        public void setContent(ContentBean content) {
            this.content = content;
        }

        public static class ContentBean {
            /**
             * text : 哈喽，小汪很高兴为您服务，有什么问题我可以帮助您的呢？
             */

            private String text;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            @Override
            public String toString() {
                return "ContentBean{" +
                        "text='" + text + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "access_key='" + access_key + '\'' +
                    ", content=" + content +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "data=" + data +
                ", success=" + success +
                ", timestamp=" + timestamp +
                '}';
    }
}
