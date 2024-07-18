/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Metric model module.
 * @module model/Metric
 */
class Metric {
    /**
     * Constructs a new <code>Metric</code>.
     * @alias module:model/Metric
     */
    constructor() { 
        
        Metric.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Metric</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Metric} obj Optional instance to populate.
     * @return {module:model/Metric} The populated <code>Metric</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Metric();

            if (data.hasOwnProperty('metric')) {
                obj['metric'] = ApiClient.convertToType(data['metric'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
            if (data.hasOwnProperty('subcategory')) {
                obj['subcategory'] = ApiClient.convertToType(data['subcategory'], 'String');
            }
            if (data.hasOwnProperty('oaPageId')) {
                obj['oaPageId'] = ApiClient.convertToType(data['oaPageId'], 'String');
            }
            if (data.hasOwnProperty('oaUrl')) {
                obj['oaUrl'] = ApiClient.convertToType(data['oaUrl'], 'String');
            }
            if (data.hasOwnProperty('factor')) {
                obj['factor'] = ApiClient.convertToType(data['factor'], 'Number');
            }
            if (data.hasOwnProperty('sdfPackage')) {
                obj['sdfPackage'] = ApiClient.convertToType(data['sdfPackage'], 'String');
            }
            if (data.hasOwnProperty('dataType')) {
                obj['dataType'] = ApiClient.convertToType(data['dataType'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Metric identifier to be used as `metrics` input in `/fundamentals/v#/fundamentals` endpoint.
 * @member {String} metric
 */
Metric.prototype['metric'] = undefined;

/**
 * Plain text name of the metric.
 * @member {String} name
 */
Metric.prototype['name'] = undefined;

/**
 * Primary Category of metric item, such as, INCOME_STATEMENT, BALANCE_SHEET, CASH_FLOW, or RATIOS.
 * @member {String} category
 */
Metric.prototype['category'] = undefined;

/**
 * Sub-category of metric item, such as ASSETS, SUPPLEMENTAL, SHAREHOLDERS_EQUITY, VALUATION, PROFITABILITY, etc.
 * @member {String} subcategory
 */
Metric.prototype['subcategory'] = undefined;

/**
 * The Online Assistant Page ID in D***** format, used to look up the definition and methodology of the requested item. Visit my.apps.factset.com/oa/pages/[D*****] for details. For example, https://my.apps.factset.com/oa/pages/D10585 will give you the definition for FF_SALES.
 * @member {String} oaPageId
 */
Metric.prototype['oaPageId'] = undefined;

/**
 * The Online Assistant Page URL, is used to look up the definition and methodology of the requested item. For example, https://my.apps.factset.com/oa/pages/D10585 will give you the definition for FF_SALES.
 * @member {String} oaUrl
 */
Metric.prototype['oaUrl'] = undefined;

/**
 * The factor for the metric (e.g. 1000 = thousands).
 * @member {Number} factor
 */
Metric.prototype['factor'] = undefined;

/**
 * An indicator for which Standard Data Feed (SDF) package the item is available in - BASIC or ADVANCED. A null value represents items available only in API.
 * @member {module:model/Metric.SdfPackageEnum} sdfPackage
 */
Metric.prototype['sdfPackage'] = undefined;

/**
 * The data type for the metric. Make note, mixing data types within a single /fundamentals API is not supported. Each dataType is defined below -   * **date** - date format expressed in YYYY-MM-DD.   * **doubleArray** - A double is a FactSet data type, similar to a float or an integer. A double represents numeric data but provides a greater amount of decimal precision than the float data type. Double values have up to 15 digits of precision, while float values have up to 7 digits (integers have up to 10 digits).   * **float** - A float value is a real number (i.e., a number that can contain a fractional part/decimals). A float value has a precision of up to seven digits and accurately represents numbers whose absolute value is less than 16,277,216 (224). An example metric includes   * **floatArray** - Function will hold data for multiple periods, as well as for many companies (i.e., two-dimensional value). The FLOATARRAY function returns data using a vertical orientation (e.g., down a column). The difference between FLOAT and FLOATARRAY is that FLOAT can only go across a row (one-dimension; horizontal orientation; vertical length=1) whereas FLOATARRAY will return data both across a row and down a column (two-dimensions; vertical orientation). With FLOATARRAY, the number of data points across a row will correspond to the number of companies queried; the number of data points down a column will correspond to the length of the time series.   * **intArray** - An integer is a whole number or zero (i.e., integers do not include decimals). Integers can be positive or negative.   * **string** - A string value is an ASCII character. A string is a sequence of ASCII characters. String value and text value are synonymous. The function will hold data for multiple time periods, as well as for many companies (i.e., two-dimensional value). The STRING_ARRAY function returns data using a vertical orientation (e.g., down a column)   * **stringArray** - The difference between STRING and STRINGARRAY is that STRING can only go across a row (one-dimension; horizontal orientation; vertical length=1) whereas STRINGARRAY will return data both across a row and down a column (two-dimensions; vertical orientation). With STRINGARRAY, the number of data points across a row will correspond to the number of companies queried; the number of data points down a column will correspond to the length of the time series. 
 * @member {String} dataType
 */
Metric.prototype['dataType'] = undefined;





/**
 * Allowed values for the <code>sdfPackage</code> property.
 * @enum {String}
 * @readonly
 */
Metric['SdfPackageEnum'] = {

    /**
     * value: "BASIC"
     * @const
     */
    "BASIC": "BASIC",

    /**
     * value: "ADVANCED"
     * @const
     */
    "ADVANCED": "ADVANCED"
};



export default Metric;

