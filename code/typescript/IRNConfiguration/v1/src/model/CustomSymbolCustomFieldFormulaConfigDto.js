/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CustomSymbolCustomFieldFormulaConfigDto model module.
 * @module model/CustomSymbolCustomFieldFormulaConfigDto
 */
class CustomSymbolCustomFieldFormulaConfigDto {
    /**
     * Constructs a new <code>CustomSymbolCustomFieldFormulaConfigDto</code>.
     * @alias module:model/CustomSymbolCustomFieldFormulaConfigDto
     * @param formula {String} 
     * @param formulaType {String} 
     */
    constructor(formula, formulaType) { 
        
        CustomSymbolCustomFieldFormulaConfigDto.initialize(this, formula, formulaType);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, formula, formulaType) { 
        obj['formula'] = formula;
        obj['formulaType'] = formulaType;
    }

    /**
     * Constructs a <code>CustomSymbolCustomFieldFormulaConfigDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CustomSymbolCustomFieldFormulaConfigDto} obj Optional instance to populate.
     * @return {module:model/CustomSymbolCustomFieldFormulaConfigDto} The populated <code>CustomSymbolCustomFieldFormulaConfigDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CustomSymbolCustomFieldFormulaConfigDto();

            if (data.hasOwnProperty('formula')) {
                obj['formula'] = ApiClient.convertToType(data['formula'], 'String');
            }
            if (data.hasOwnProperty('formulaType')) {
                obj['formulaType'] = ApiClient.convertToType(data['formulaType'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} formula
 */
CustomSymbolCustomFieldFormulaConfigDto.prototype['formula'] = undefined;

/**
 * @member {String} formulaType
 */
CustomSymbolCustomFieldFormulaConfigDto.prototype['formulaType'] = undefined;






export default CustomSymbolCustomFieldFormulaConfigDto;

