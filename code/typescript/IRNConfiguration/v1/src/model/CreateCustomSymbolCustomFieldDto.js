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
        obj['code'] = code;
        obj['name'] = name;
        obj['type'] = type;
        obj['isHidden'] = isHidden || false;
        obj['isMandatory'] = isMandatory || false;
        obj['isShownInInfobox'] = isShownInInfobox || true;
        obj['customSymbolTypes'] = customSymbolTypes;
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

            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('isHidden')) {
                obj['isHidden'] = ApiClient.convertToType(data['isHidden'], 'Boolean');
            }
            if (data.hasOwnProperty('isMandatory')) {
                obj['isMandatory'] = ApiClient.convertToType(data['isMandatory'], 'Boolean');
            }
            if (data.hasOwnProperty('isShownInInfobox')) {
                obj['isShownInInfobox'] = ApiClient.convertToType(data['isShownInInfobox'], 'Boolean');
            }
            if (data.hasOwnProperty('formulaConfig')) {
                obj['formulaConfig'] = CustomSymbolCustomFieldFormulaConfigDto.constructFromObject(data['formulaConfig']);
            }
            if (data.hasOwnProperty('optionsConfig')) {
                obj['optionsConfig'] = ApiClient.convertToType(data['optionsConfig'], ['String']);
            }
            if (data.hasOwnProperty('customSymbolTypes')) {
                obj['customSymbolTypes'] = ApiClient.convertToType(data['customSymbolTypes'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} code
 */
CreateCustomSymbolCustomFieldDto.prototype['code'] = undefined;

/**
 * @member {String} name
 */
CreateCustomSymbolCustomFieldDto.prototype['name'] = undefined;

/**
 * Type can be one of Text, SingleOption, MultiOptions, Numeric, Date, ExtendedText, ContactLookup
 * @member {String} type
 */
CreateCustomSymbolCustomFieldDto.prototype['type'] = undefined;

/**
 * @member {Boolean} isHidden
 * @default false
 */
CreateCustomSymbolCustomFieldDto.prototype['isHidden'] = false;

/**
 * @member {Boolean} isMandatory
 * @default false
 */
CreateCustomSymbolCustomFieldDto.prototype['isMandatory'] = false;

/**
 * @member {Boolean} isShownInInfobox
 * @default true
 */
CreateCustomSymbolCustomFieldDto.prototype['isShownInInfobox'] = true;

/**
 * @member {module:model/CustomSymbolCustomFieldFormulaConfigDto} formulaConfig
 */
CreateCustomSymbolCustomFieldDto.prototype['formulaConfig'] = undefined;

/**
 * @member {Array.<String>} optionsConfig
 */
CreateCustomSymbolCustomFieldDto.prototype['optionsConfig'] = undefined;

/**
 * @member {Array.<String>} customSymbolTypes
 */
CreateCustomSymbolCustomFieldDto.prototype['customSymbolTypes'] = undefined;






export default CreateCustomSymbolCustomFieldDto;

