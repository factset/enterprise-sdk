/*
 * Cabot Models API
 *
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = FactSet.SDK.Cabot.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Cabot.Model
{
    /// <summary>
    /// All currently available attributes.&lt;br/&gt;&lt;br/&gt;QFL_EY : EPS for the most recent 12-month period/Share price&lt;br/&gt;QFL_PEG : Price to Earnings/Growth rate&lt;br/&gt;QFL_OCFY : Operating cash flow (FF_OPER_CF)/Market value&lt;br/&gt;QFL_BP : Price/book value per share ratio&lt;br/&gt;QFL_SP : Sales to Price (SP) Net sales/Market value&lt;br/&gt;QFL_OCF_EARNINGS_VAR : Differences of earnings per share in both positive and negative directions&lt;br/&gt;QFL_DY : Indicated annual dividend/Latest close price&lt;br/&gt;QFL_NET_MGN : Net profit/Net sales * 100&lt;br/&gt;QFL_OPER_MGN : Operating Income/Net Sales * 100&lt;br/&gt;QFL_ROE : Net income/Total shareholders&#39; equity&lt;br/&gt;QFL_CFROE : Net cash provided by/used in operating activities /Total shareholders&#39; equity&lt;br/&gt;QFL_EPS_GR_5Y : Compounded annual growth rate (CAGR) of EPS over the previous 5 financial years&lt;br/&gt;QFL_OCF_GR_5Y : Compounded annual growth rate (CAGR) of CFO over the previous 5 financial years&lt;br/&gt;QFL_SALES_GR_5Y : Compounded annual growth rate (CAGR) of Revenue over the previous 5 financial years&lt;br/&gt;QFL_DPS_GR_5Y : Compounded annual growth rate (CAGR) of Dividend over the previous 5 financial years&lt;br/&gt;QFL_EPS_GR_1Y : 1Y EPS Growth,Growth rate of EPS over the previous financial years&lt;br/&gt;QFL_OCF_GR_1Y : Growth rate of CFO over the previous financial years&lt;br/&gt;QFL_SALES_GR_1Y : Growth rate of Revenue over the previous financial years&lt;br/&gt;QFL_LT_DEBT_EQUITY : Long-term debt/Shareholders&#39; Equity&lt;br/&gt;QFL_DEBT_ASSETS : Long-term debt/total assets&lt;br/&gt;QFL_EBITDAEV : Represents unreported fiscal year (F1) Enterprise Value to EBITDA&lt;br/&gt;QFL_REVEV : Represents Enterprise Value to Revenue&lt;br/&gt;QFL_ROIC : Net Income/Two fiscal period average of Total Invested Capital * 100&lt;br/&gt;QFL_CFROIC : Net cash provided by/used in operating activities divided by the sum of the company&#39;s total shareholders&#39; equity and its long-term liabilities&lt;br/&gt;
    /// </summary>
    /// <value>All currently available attributes.&lt;br/&gt;&lt;br/&gt;QFL_EY : EPS for the most recent 12-month period/Share price&lt;br/&gt;QFL_PEG : Price to Earnings/Growth rate&lt;br/&gt;QFL_OCFY : Operating cash flow (FF_OPER_CF)/Market value&lt;br/&gt;QFL_BP : Price/book value per share ratio&lt;br/&gt;QFL_SP : Sales to Price (SP) Net sales/Market value&lt;br/&gt;QFL_OCF_EARNINGS_VAR : Differences of earnings per share in both positive and negative directions&lt;br/&gt;QFL_DY : Indicated annual dividend/Latest close price&lt;br/&gt;QFL_NET_MGN : Net profit/Net sales * 100&lt;br/&gt;QFL_OPER_MGN : Operating Income/Net Sales * 100&lt;br/&gt;QFL_ROE : Net income/Total shareholders&#39; equity&lt;br/&gt;QFL_CFROE : Net cash provided by/used in operating activities /Total shareholders&#39; equity&lt;br/&gt;QFL_EPS_GR_5Y : Compounded annual growth rate (CAGR) of EPS over the previous 5 financial years&lt;br/&gt;QFL_OCF_GR_5Y : Compounded annual growth rate (CAGR) of CFO over the previous 5 financial years&lt;br/&gt;QFL_SALES_GR_5Y : Compounded annual growth rate (CAGR) of Revenue over the previous 5 financial years&lt;br/&gt;QFL_DPS_GR_5Y : Compounded annual growth rate (CAGR) of Dividend over the previous 5 financial years&lt;br/&gt;QFL_EPS_GR_1Y : 1Y EPS Growth,Growth rate of EPS over the previous financial years&lt;br/&gt;QFL_OCF_GR_1Y : Growth rate of CFO over the previous financial years&lt;br/&gt;QFL_SALES_GR_1Y : Growth rate of Revenue over the previous financial years&lt;br/&gt;QFL_LT_DEBT_EQUITY : Long-term debt/Shareholders&#39; Equity&lt;br/&gt;QFL_DEBT_ASSETS : Long-term debt/total assets&lt;br/&gt;QFL_EBITDAEV : Represents unreported fiscal year (F1) Enterprise Value to EBITDA&lt;br/&gt;QFL_REVEV : Represents Enterprise Value to Revenue&lt;br/&gt;QFL_ROIC : Net Income/Two fiscal period average of Total Invested Capital * 100&lt;br/&gt;QFL_CFROIC : Net cash provided by/used in operating activities divided by the sum of the company&#39;s total shareholders&#39; equity and its long-term liabilities&lt;br/&gt;</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Attributes
    {
        /// <summary>
        /// Enum EY for value: QFL_EY
        /// </summary>
        [EnumMember(Value = "QFL_EY")]
        EY = 1,

        /// <summary>
        /// Enum PEG for value: QFL_PEG
        /// </summary>
        [EnumMember(Value = "QFL_PEG")]
        PEG = 2,

        /// <summary>
        /// Enum OCFY for value: QFL_OCFY
        /// </summary>
        [EnumMember(Value = "QFL_OCFY")]
        OCFY = 3,

        /// <summary>
        /// Enum BP for value: QFL_BP
        /// </summary>
        [EnumMember(Value = "QFL_BP")]
        BP = 4,

        /// <summary>
        /// Enum SP for value: QFL_SP
        /// </summary>
        [EnumMember(Value = "QFL_SP")]
        SP = 5,

        /// <summary>
        /// Enum OCFEARNINGSVAR for value: QFL_OCF_EARNINGS_VAR
        /// </summary>
        [EnumMember(Value = "QFL_OCF_EARNINGS_VAR")]
        OCFEARNINGSVAR = 6,

        /// <summary>
        /// Enum DY for value: QFL_DY
        /// </summary>
        [EnumMember(Value = "QFL_DY")]
        DY = 7,

        /// <summary>
        /// Enum NETMGN for value: QFL_NET_MGN
        /// </summary>
        [EnumMember(Value = "QFL_NET_MGN")]
        NETMGN = 8,

        /// <summary>
        /// Enum OPERMGN for value: QFL_OPER_MGN
        /// </summary>
        [EnumMember(Value = "QFL_OPER_MGN")]
        OPERMGN = 9,

        /// <summary>
        /// Enum ROE for value: QFL_ROE
        /// </summary>
        [EnumMember(Value = "QFL_ROE")]
        ROE = 10,

        /// <summary>
        /// Enum CFROE for value: QFL_CFROE
        /// </summary>
        [EnumMember(Value = "QFL_CFROE")]
        CFROE = 11,

        /// <summary>
        /// Enum EPSGR5Y for value: QFL_EPS_GR_5Y
        /// </summary>
        [EnumMember(Value = "QFL_EPS_GR_5Y")]
        EPSGR5Y = 12,

        /// <summary>
        /// Enum OCFGR5Y for value: QFL_OCF_GR_5Y
        /// </summary>
        [EnumMember(Value = "QFL_OCF_GR_5Y")]
        OCFGR5Y = 13,

        /// <summary>
        /// Enum SALESGR5Y for value: QFL_SALES_GR_5Y
        /// </summary>
        [EnumMember(Value = "QFL_SALES_GR_5Y")]
        SALESGR5Y = 14,

        /// <summary>
        /// Enum DPSGR5Y for value: QFL_DPS_GR_5Y
        /// </summary>
        [EnumMember(Value = "QFL_DPS_GR_5Y")]
        DPSGR5Y = 15,

        /// <summary>
        /// Enum EPSGR1Y for value: QFL_EPS_GR_1Y
        /// </summary>
        [EnumMember(Value = "QFL_EPS_GR_1Y")]
        EPSGR1Y = 16,

        /// <summary>
        /// Enum OCFGR1Y for value: QFL_OCF_GR_1Y
        /// </summary>
        [EnumMember(Value = "QFL_OCF_GR_1Y")]
        OCFGR1Y = 17,

        /// <summary>
        /// Enum SALESGR1Y for value: QFL_SALES_GR_1Y
        /// </summary>
        [EnumMember(Value = "QFL_SALES_GR_1Y")]
        SALESGR1Y = 18,

        /// <summary>
        /// Enum LTDEBTEQUITY for value: QFL_LT_DEBT_EQUITY
        /// </summary>
        [EnumMember(Value = "QFL_LT_DEBT_EQUITY")]
        LTDEBTEQUITY = 19,

        /// <summary>
        /// Enum DEBTASSETS for value: QFL_DEBT_ASSETS
        /// </summary>
        [EnumMember(Value = "QFL_DEBT_ASSETS")]
        DEBTASSETS = 20,

        /// <summary>
        /// Enum EBITDAEV for value: QFL_EBITDAEV
        /// </summary>
        [EnumMember(Value = "QFL_EBITDAEV")]
        EBITDAEV = 21,

        /// <summary>
        /// Enum REVEV for value: QFL_REVEV
        /// </summary>
        [EnumMember(Value = "QFL_REVEV")]
        REVEV = 22,

        /// <summary>
        /// Enum ROIC for value: QFL_ROIC
        /// </summary>
        [EnumMember(Value = "QFL_ROIC")]
        ROIC = 23,

        /// <summary>
        /// Enum CFROIC for value: QFL_CFROIC
        /// </summary>
        [EnumMember(Value = "QFL_CFROIC")]
        CFROIC = 24

    }

}
