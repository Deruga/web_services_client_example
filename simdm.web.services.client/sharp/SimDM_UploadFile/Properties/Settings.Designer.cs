﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:2.0.50727.5477
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace SimDM_UploadFile.Properties {
    
    
    [global::System.Runtime.CompilerServices.CompilerGeneratedAttribute()]
    [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.VisualStudio.Editors.SettingsDesigner.SettingsSingleFileGenerator", "9.0.0.0")]
    internal sealed partial class Settings : global::System.Configuration.ApplicationSettingsBase {
        
        private static Settings defaultInstance = ((Settings)(global::System.Configuration.ApplicationSettingsBase.Synchronized(new Settings())));
        
        public static Settings Default {
            get {
                return defaultInstance;
            }
        }
        
        [global::System.Configuration.ApplicationScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.SpecialSettingAttribute(global::System.Configuration.SpecialSetting.WebServiceUrl)]
        [global::System.Configuration.DefaultSettingValueAttribute("http://localhost:8080/EDMWS/earlybinding/options_2097152/DataRepository/SimDM_Mas" +
            "ter/QEX/SIMDM_MASTER_WSDL")]
        public string SimDM_UploadFile_SimDM_Master_SIMDM_MASTER_WSDLService {
            get {
                return ((string)(this["SimDM_UploadFile_SimDM_Master_SIMDM_MASTER_WSDLService"]));
            }
        }
        
        [global::System.Configuration.ApplicationScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.SpecialSettingAttribute(global::System.Configuration.SpecialSetting.WebServiceUrl)]
        [global::System.Configuration.DefaultSettingValueAttribute("http://localhost:8080/EDMWS/AccessControl")]
        public string SimDM_UploadFile_AccessControl_EDMAccessControlService {
            get {
                return ((string)(this["SimDM_UploadFile_AccessControl_EDMAccessControlService"]));
            }
        }
        
        [global::System.Configuration.ApplicationScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.SpecialSettingAttribute(global::System.Configuration.SpecialSetting.WebServiceUrl)]
        [global::System.Configuration.DefaultSettingValueAttribute("http://localhost:8080/EDMWS/earlybinding/DataRepository/CascadedCsys-ROTFIX-sol10" +
            "1-out/QEX/node_query")]
        public string SimDM_UploadFile_node_query_node_queryService {
            get {
                return ((string)(this["SimDM_UploadFile_node_query_node_queryService"]));
            }
        }
        
        [global::System.Configuration.ApplicationScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.SpecialSettingAttribute(global::System.Configuration.SpecialSetting.WebServiceUrl)]
        [global::System.Configuration.DefaultSettingValueAttribute("http://localhost:8080/EDMWS/earlybinding/options_2097152/SimDM_system/Config/QEX/" +
            "simdm_config_support")]
        public string SimDM_UploadFile_SimDM_Query_simdm_config_supportService {
            get {
                return ((string)(this["SimDM_UploadFile_SimDM_Query_simdm_config_supportService"]));
            }
        }
    }
}
