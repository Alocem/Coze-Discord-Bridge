package catx.feitu.coze_discord_bridge.Config;

import java.util.ArrayList;
import java.util.List;

public class ConfigData {

        public List<ConfigBotsData> Bots = new ArrayList<>();
        public Boolean UsingProxy = false;

        public String ProxyType = "HTTP";
        public String ProxyIP = "127.0.0.1";
        public int ProxyPort = 8080;


        public long generate_timeout = 10000;

        public boolean Disable_CozeBot_ReplyMsgCheck = false;
        public boolean Disable_Name_Cache = false;
        public boolean Disable_2000Limit_Unlock = false;

        public int APIPort = 8092;
        public int APIMaxThread = 10;
        public int APISSLPort = 8093;
        public String APISSL_keyStorePath = "";
        public String APISSL_keyStorePassword = "";

        public int OpenAPI_Chat_Default_Models2Conversation = 0;
        public String OpenAPI_Chat_Default_Channel = "default";
        public String OpenAPI_Chat_MsgForward_Prefix = "";
        public String OpenAPI_Chat_MsgForward_Suffix = "";
        public String OpenAPI_ImageGenerate_Default_Channel = "";
        public String OpenAI_ImageGenerate_Prompt_Prefix = "画图";
        public String OpenAI_ImageGenerate_Prompt_Suffix = "";

}
