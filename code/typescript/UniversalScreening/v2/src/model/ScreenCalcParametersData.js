/**
 * Universal Screening API
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 2.0.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ScreenCalcParametersData model module.
 * @module model/ScreenCalcParametersData
 */
class ScreenCalcParametersData {
    /**
     * Constructs a new <code>ScreenCalcParametersData</code>.
     * Object containing screen data
     * @alias module:model/ScreenCalcParametersData
     * @param screenName {String} File path to a valid screen
     */
    constructor(screenName) { 
        
        ScreenCalcParametersData.initialize(this, screenName);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, screenName) { 
        obj['screenName'] = screenName;
    }

    /**
     * Constructs a <code>ScreenCalcParametersData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ScreenCalcParametersData} obj Optional instance to populate.
     * @return {module:model/ScreenCalcParametersData} The populated <code>ScreenCalcParametersData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ScreenCalcParametersData();

            if (data.hasOwnProperty('backtestDate')) {
                obj['backtestDate'] = ApiClient.convertToType(data['backtestDate'], 'String');
            }
            if (data.hasOwnProperty('globalVariablesMap')) {
                obj['globalVariablesMap'] = ApiClient.convertToType(data['globalVariablesMap'], {'String': 'String'});
            }
            if (data.hasOwnProperty('legacyUniverseType')) {
                obj['legacyUniverseType'] = ApiClient.convertToType(data['legacyUniverseType'], 'String');
            }
            if (data.hasOwnProperty('screenName')) {
                obj['screenName'] = ApiClient.convertToType(data['screenName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Specifies the backtest date used when running the screen, replacing the backtest date saved in the screen, can be written in YYYYMMDD, MM/DD/YYYY or relative (0, -1, 0/-1/0) format. Requires addtional access to use.
 * @member {String} backtestDate
 */
ScreenCalcParametersData.prototype['backtestDate'] = undefined;

/**
 * Modifies existing global variables for this calculation request, temporarily adds them if they do not already exist Variable names can only contain the characters A-Z (case insensitive). Variable values must be non-empty.
 * @member {Object.<String, String>} globalVariablesMap
 */
ScreenCalcParametersData.prototype['globalVariablesMap'] = undefined;

/**
 * Universe type to open a Screen 1.0 document with\\ `equity`: Uses the equity universe from the Screen 1.0 document.\\ `debt`: Uses the debt universe from the Screen 1.0 document.\\ `fund`: Uses the fund universe from the Screen 1.0 document.
 * @member {module:model/ScreenCalcParametersData.LegacyUniverseTypeEnum} legacyUniverseType
 * @default 'equity'
 */
ScreenCalcParametersData.prototype['legacyUniverseType'] = 'equity';

/**
 * File path to a valid screen
 * @member {String} screenName
 */
ScreenCalcParametersData.prototype['screenName'] = undefined;





/**
 * Allowed values for the <code>legacyUniverseType</code> property.
 * @enum {String}
 * @readonly
 */
ScreenCalcParametersData['LegacyUniverseTypeEnum'] = {

    /**
     * value: "equity"
     * @const
     */
    "equity": "equity",

    /**
     * value: "debt"
     * @const
     */
    "debt": "debt",

    /**
     * value: "fund"
     * @const
     */
    "fund": "fund"
};



export default ScreenCalcParametersData;

