/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.16.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PACalculationColumn from './PACalculationColumn';
import PACalculationDataSources from './PACalculationDataSources';
import PACalculationGroup from './PACalculationGroup';
import PADateParameters from './PADateParameters';
import PAIdentifier from './PAIdentifier';
import TemplateContentTypes from './TemplateContentTypes';

/**
 * The UnlinkedPATemplate model module.
 * @module model/UnlinkedPATemplate
 */
class UnlinkedPATemplate {
    /**
     * Constructs a new <code>UnlinkedPATemplate</code>.
     * @alias module:model/UnlinkedPATemplate
     */
    constructor() { 
        
        UnlinkedPATemplate.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UnlinkedPATemplate</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UnlinkedPATemplate} obj Optional instance to populate.
     * @return {module:model/UnlinkedPATemplate} The populated <code>UnlinkedPATemplate</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UnlinkedPATemplate();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('directory')) {
                obj['directory'] = ApiClient.convertToType(data['directory'], 'String');
            }
            if (data.hasOwnProperty('templateTypeId')) {
                obj['templateTypeId'] = ApiClient.convertToType(data['templateTypeId'], 'String');
            }
            if (data.hasOwnProperty('snapshot')) {
                obj['snapshot'] = ApiClient.convertToType(data['snapshot'], 'Boolean');
            }
            if (data.hasOwnProperty('accounts')) {
                obj['accounts'] = ApiClient.convertToType(data['accounts'], [PAIdentifier]);
            }
            if (data.hasOwnProperty('benchmarks')) {
                obj['benchmarks'] = ApiClient.convertToType(data['benchmarks'], [PAIdentifier]);
            }
            if (data.hasOwnProperty('columns')) {
                obj['columns'] = ApiClient.convertToType(data['columns'], [PACalculationColumn]);
            }
            if (data.hasOwnProperty('dates')) {
                obj['dates'] = PADateParameters.constructFromObject(data['dates']);
            }
            if (data.hasOwnProperty('groups')) {
                obj['groups'] = ApiClient.convertToType(data['groups'], [PACalculationGroup]);
            }
            if (data.hasOwnProperty('datasources')) {
                obj['datasources'] = PACalculationDataSources.constructFromObject(data['datasources']);
            }
            if (data.hasOwnProperty('currencyisocode')) {
                obj['currencyisocode'] = ApiClient.convertToType(data['currencyisocode'], 'String');
            }
            if (data.hasOwnProperty('componentdetail')) {
                obj['componentdetail'] = ApiClient.convertToType(data['componentdetail'], 'String');
            }
            if (data.hasOwnProperty('content')) {
                obj['content'] = TemplateContentTypes.constructFromObject(data['content']);
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Template id.
 * @member {String} id
 */
UnlinkedPATemplate.prototype['id'] = undefined;

/**
 * Template directory.
 * @member {String} directory
 */
UnlinkedPATemplate.prototype['directory'] = undefined;

/**
 * Template type id
 * @member {String} templateTypeId
 */
UnlinkedPATemplate.prototype['templateTypeId'] = undefined;

/**
 * snapshot.
 * @member {Boolean} snapshot
 */
UnlinkedPATemplate.prototype['snapshot'] = undefined;

/**
 * List of accounts
 * @member {Array.<module:model/PAIdentifier>} accounts
 */
UnlinkedPATemplate.prototype['accounts'] = undefined;

/**
 * List of benchmarks
 * @member {Array.<module:model/PAIdentifier>} benchmarks
 */
UnlinkedPATemplate.prototype['benchmarks'] = undefined;

/**
 * List of columns for the PA calculation
 * @member {Array.<module:model/PACalculationColumn>} columns
 */
UnlinkedPATemplate.prototype['columns'] = undefined;

/**
 * @member {module:model/PADateParameters} dates
 */
UnlinkedPATemplate.prototype['dates'] = undefined;

/**
 * List of groupings for the PA calculation
 * @member {Array.<module:model/PACalculationGroup>} groups
 */
UnlinkedPATemplate.prototype['groups'] = undefined;

/**
 * @member {module:model/PACalculationDataSources} datasources
 */
UnlinkedPATemplate.prototype['datasources'] = undefined;

/**
 * Currency ISO code for calculation.
 * @member {String} currencyisocode
 */
UnlinkedPATemplate.prototype['currencyisocode'] = undefined;

/**
 * PA storage type. It can be GROUPS or GROUPSALL or TOTALS or SECURITIES.
 * @member {String} componentdetail
 */
UnlinkedPATemplate.prototype['componentdetail'] = undefined;

/**
 * @member {module:model/TemplateContentTypes} content
 */
UnlinkedPATemplate.prototype['content'] = undefined;

/**
 * Template description.
 * @member {String} description
 */
UnlinkedPATemplate.prototype['description'] = undefined;

/**
 * Template name.
 * @member {String} name
 */
UnlinkedPATemplate.prototype['name'] = undefined;

/**
 * Unlinked template category
 * @member {String} category
 */
UnlinkedPATemplate.prototype['category'] = undefined;






export default UnlinkedPATemplate;

