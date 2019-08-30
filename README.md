# tomDemoSpring
實作一個spring4的範例專案  

## 使用ModelMap方式回應請求
http://localhost:8080/TomDemoSpring/mainController/mainActionByModelMap

## 使用ModelAndView方式回應請求
http://localhost:8080/TomDemoSpring/mainController/mainActionByModelAndView


##註
實作一個spring4的範例專案  

需加載log4j的配置文件才可於控制台打印相關log  

會第一步加載項目中的web.xml文件文件，通過其中的各種配置來啟動項目，只有其中配置的各項均無誤時，項目才能正確啟動.web.xml有多項標籤，在其加載的 過程中順序依次為：context-param >> listener >> fileter >> servlet  

在springmvc中，如果使用@ResponseBody返回json格式對象，需要導入jackson的jar包。  

###web.xml
contextConfigLocation: 負責加載相關xml
ContextLoaderListener: 負責將加載的XML初始化(如未設定contextConfigLocation，則預設讀取applicationContext.xml)
DispatcherServlet: 前端處理器，負責處理http請求
CharacterEncodingFilter: 負責編碼，避免出現亂碼，一般使用utf-8





