/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CustomSymbolCustomFieldFormulaConfigDto from './CustomSymbolCustomFieldFormulaConfigDto';

/**
 * The CreateCustomSymbolCustomFieldDto model module.
 * @module model/CreateCustomSymbolCustomFieldDto
 */
class CreateCustomSymbolCustomFieldDto {
    /**
     * Constructs a new <code>CreateCustomSymbolCustomFieldDto</code>.
     * @alias module:model/CreateCustomSymbolCustomFieldDto
     * @param code {String} 
     * @param name {String} 
     * @param type {String} Type can be one of Text, SingleOption, MultiOptions, Numeric, Date, ExtendedText, ContactLookup
     * @param isHidden {Boolean} 
     * @param isMandatory {Boolean} 
     * @param isShownInInfobox {Boolean} 
     * @param customSymbolTypes {Array.<String>} 
     */
    constructor(code, name, type, isHidden, isMandatory, isShownInInfobox, customSymbolTypes) { 
        
        CreateCustomSymbolCustomFieldDto.initialize(this, code, name, type, isHidden, isMandatory, isShownInInfobox, customSymbolTypes);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, code, name, type, isHidden, isMandatory, isShownInInfobox, customSymbolTypes) { 
        obj['Code'] = code;
        obj['Name'] = name;
        obj['Type'] = type;
        obj['IsHidden'] = isHidden || false;
        obj['IsMandatory'] = isMandatory || false;
        obj['IsShownInInfobox'] = isShownInInfobox || true;
        obj['CustomSymbolTypes'] = customSymbolTypes;
    }

    /**
     * Constructs a <code>CreateCustomSymbolCustomFieldDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateCustomSymbolCustomFieldDto} obj Optional instance to populate.
     * @return {module:model/CreateCustomSymbolCustomFieldDto} The populated <code>CreateCustomSymbolCustomFieldDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateCustomSymbolCustomFieldDto();

            if (data.hasOwnProperty('Code')) {
                obj['Code'] = ApiClient.convertToType(data['Code'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('IsHidden')) {
                obj['IsHidden'] = ApiClient.convertToType(data['IsHidden'], 'Boolean');
            }
            if (data.hasOwnProperty('IsMandatory')) {
                obj['IsMandatory'] = ApiClient.convertToType(data['IsMandatory'], 'Boolean');
            }
            if (data.hasOwnProperty('IsShownInInfobox')) {
                obj['IsShownInInfobox'] = ApiClient.convertToType(data['IsShownInInfobox'], 'Boolean');
            }
            if (data.hasOwnProperty('FormulaConfig')) {
                obj['FormulaConfig'] = CustomSymbolCustomFieldFormulaConfigDto.constructFromObject(data['FormulaConfig']);
            }
            if (data.hasOwnProperty('OptionsConfig')) {
                obj['OptionsConfig'] = ApiClient.convertToType(data['OptionsConfig'], ['String']);
            }
            if (data.hasOwnProperty('CustomSymbolTypes')) {
                obj['CustomSymbolTypes'] = ApiClient.convertToType(data['CustomSymbolTypes'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} Code
 */
CreateCustomSymbolCustomFieldDto.prototype['Code'] = undefined;

/**
 * @member {String} Name
 */
CreateCustomSymbolCustomFieldDto.prototype['Name'] = undefined;

/**
 * Type can be one of Text, SingleOption, MultiOptions, Numeric, Date, ExtendedText, ContactLookup
 * @member {String} Type
 */
CreateCustomSymbolCustomFieldDto.prototype['Type'] = undefined;

/**
 * @member {Boolean} IsHidden
 * @default false
 */
CreateCustomSymbolCustomFieldDto.prototype['IsHidden'] = false;

/**
 * @member {Boolean} IsMandatory
 * @default false
 */
CreateCustomSymbolCustomFieldDto.prototype['IsMandatory'] = false;

/**
 * @member {Boolean} IsShownInInfobox
 * @default true
 */
CreateCustomSymbolCustomFieldDto.prototype['IsShownInInfobox'] = true;

/**
 * @member {module:model/CustomSymbolCustomFieldFormulaConfigDto} FormulaConfig
 */
CreateCustomSymbolCustomFieldDto.prototype['FormulaConfig'] = undefined;

/**
 * @member {Array.<String>} OptionsConfig
 */
CreateCustomSymbolCustomFieldDto.prototype['OptionsConfig'] = undefined;

/**
 * @member {Array.<String>} CustomSymbolTypes
 */
CreateCustomSymbolCustomFieldDto.prototype['CustomSymbolTypes'] = undefined;






export default CreateCustomSymbolCustomFieldDto;

