/**
 * FactSet ESG API
 * FactSet ESG (powered by FactSet Truvalue Labs) applies machine learning to uncover risks and opportunities from companies' Environmental, Social and Governance (ESG) behavior, which are aggregated and categorized into continuously updated, material ESG scores. The service focuses on company ESG behavior from external sources and includes both positive and negative events that go beyond traditional sources of ESG risk data.<p> FactSet ESG extracts, analyzes, and generates scores from millions of documents each month collected from more than 100,000 data sources in over 30 languages. Sources include news, trade journals, NGOs, watchdog groups, trade blogs, industry reports and social media. Products deliver investable insights by revealing value and risk factors from unstructured data at the speed of current events.</p> 
 *
 * The version of the OpenAPI document: 1.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import DateOf from './DateOf';

/**
 * The SdgArticlesRequest model module.
 * @module model/SdgArticlesRequest
 */
class SdgArticlesRequest {
    /**
     * Constructs a new <code>SdgArticlesRequest</code>.
     * SDG Articles Request Body
     * @alias module:model/SdgArticlesRequest
     * @param ids {Array.<String>} Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input.  *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
     * @param startDate {String} The start date requested for a given date range in YYYY-MM-DD format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint. 
     * @param endDate {String} The end date requested for a given date range in YYYY-MM-DD format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint. 
     */
    constructor(ids, startDate, endDate) { 
        
        SdgArticlesRequest.initialize(this, ids, startDate, endDate);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids, startDate, endDate) { 
        obj['ids'] = ids;
        obj['startDate'] = startDate;
        obj['endDate'] = endDate;
    }

    /**
     * Constructs a <code>SdgArticlesRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SdgArticlesRequest} obj Optional instance to populate.
     * @return {module:model/SdgArticlesRequest} The populated <code>SdgArticlesRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SdgArticlesRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('categories')) {
                obj['categories'] = ApiClient.convertToType(data['categories'], ['String']);
            }
            if (data.hasOwnProperty('fields')) {
                obj['fields'] = ApiClient.convertToType(data['fields'], ['String']);
            }
            if (data.hasOwnProperty('startDate')) {
                obj['startDate'] = ApiClient.convertToType(data['startDate'], 'String');
            }
            if (data.hasOwnProperty('endDate')) {
                obj['endDate'] = ApiClient.convertToType(data['endDate'], 'String');
            }
            if (data.hasOwnProperty('dateOf')) {
                obj['dateOf'] = DateOf.constructFromObject(data['dateOf']);
            }
        }
        return obj;
    }


}

/**
 * Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input.  *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
 * @member {Array.<String>} ids
 */
SdgArticlesRequest.prototype['ids'] = undefined;

/**
 * The SDG Categories specified for the Truvalue Scores being requested. To specify select categories returned in the response, provide a comma-separated list of the scores using the description below.  |**SDG Category Input**|**Description**| |---|---| |**IMPACT**|**Impact** - Provides Articles tagged to all SDG categories| |**GOAL1NOPOVERTY**|**No Poverty** - Goal 1 focuses on poverty in all its manifestations and also aims to ensure social protection for the poor and vulnerable, increase access to basic services and support people harmed by climate related extreme events and other economic, social and environmental shocks and disasters. <p>**Company-Level Issue Examples** *- Financial services access and affordability, Underserved groups,Unethical pricing.*| |**GOAL2ZEROHUNGER**|**Zero Hunger** - Goal 2 aims to end hunger and all forms of malnutrition and commits to universal access to safe, nutritious and sufficient food at all times of the year, particularly for the poor and people in vulnerable situations (e.g., infants). This will require sustainable food production systems and resilient agricultural practices, equal access to land, technology, and markets and international cooperation on investments in infrastructure and technology to boost agricultural productivity. <p>**Company-Level Issue Examples** *- Sustainable agricultural practices, Agricultural ingredients sourcing and certifications, Food safety concerns, Animal welfare.*| |**GOAL3GOODHEALTHANDWELLBEING**|**Good Health and Wellbeing** - Goal 3 seeks to ensure health and wellbeing for all, at every stage of life and addresses all major health priorities, including reproductive, maternal, and child health; communicable, noncommunicable and environmental diseases; universal health coverage; and access for all to safe, effective, quality, and affordable medicines and vaccines.<p> **Company-Level Issue Examples** *- Harmful Chemicals in Products, Product Recalls, Healthcare Access and Affordability.*| |**GOAL4QUALITYEDUCATION**|**Quality Education** - Goal 4 addresses access and affordability of education and skills development starting from childhood development and continuing through adulthood, including for girls, persons with disabilities, indigenous peoples and children in vulnerable situations, Improvements to the access to education it hopes to ensure that all youth and a substantial proportion of adults achieve literacy and numeracy. It also seeks to build and upgrade education facilities and to increase the supply of qualified teachers.<p>**Company-Level Issue Examples** *- Mentorship and training, Education company quality, Education company ethics.*| |**GOAL5GENDEREQUALITY**|**Gender Equality** - Goal 5 emphasizes eliminating discrimination and violence against women and girls. The Goal emphasizes ensuring women's full and effective participation and equal opportunities for leadership at all levels of decision-making in political, economic and public life. Access to sexual and reproductive health and reproductive rights and access to economic resources (e.g., land ownership, financial services) are also emphasized.<p>**Company-Level Issue Examples** *- Board Diversity, Gender Discrimination, Sexual Harassment.*| |**GOAL6CLEANWATERANDSANITATION**|**Clean Water and Sanitation** - Goal 6 not only addresses issues relating to drinking water, sanitation and hygiene, but also the quality and sustainability of water resources worldwide. It strives to achieve universal and equitable access to safe and affordable drinking water for all. It also focuses on adequate and equitable sanitation and hygiene and reducing pollution, minimizing release of hazardous chemicals and materials, and protection of water-related ecosystems. It also highlights increasing water-use efficiency across all sectors, recycling, and ensuring sustainable withdrawals and supply of freshwater.<p>**Company-Level Issue Examples** *- Water Pollution, Water Recycling and Stewardship, Water Infrastructure.*| |**GOAL7AFFORDABLEANDCLEANENERGY**|**Goal 7 Affordable and Clean Energy** - Goal 7 seeks to ensure access to affordable, reliable, and modern energy services for all. It aims to increase renewable energy in the global energy mix and improve energy efficiency significantly. It also calls for more access to clean energy research, technology, and infrastructure for renewable energy, energy efficiency, and advanced and cleaner fossil-fuel technology, and promoting investment in energy infrastructure and clean energy technology.<p>**Company-Level Issue Examples** *- Green Buildings, Renewable Energy, Unethical Utility Pricing.*| |**GOAL8DECENTWORKANDECONOMICGROWTH**|**Decent Work and Economic Growth** - Goal 8 focuses on economic productivity and supports policies for entrepreneurship, creativity and innovation that assist micro, small, and medium-sized enterprises. The Goal also seeks to reduce unemployment, the proportion of youth not working or in school, child labor, and forced labor. Also covered are the protection of labor rights, migrant workers, safe and secure working environments, sustainable tourism, and increasing the capacity of domestic financial institutions in regards to access to banking, insurance, and financial services.<p>**Company-Level Issue Examples** *-  Job Creation, Labor Exploitation, Employee Health and Safety, Workplace Turnover, Supplier Transparency.*| |**GOAL9INDUSTRYINNOVATIONANDINFRASTRUCTURE**|**Industry Innovation and Infrastructure** - Goal 9 focuses on three important aspects of sustainable development, infrastructure, industrialization and innovation, including considerations for resiliency, equity, quality, reliability, access and affordability, and regional and transborder infrastructure. The Goal focuses on infrastructure upgrades and retrofitting of industries with increased resource-use efficiency and clean and environmentally sound technologies and industrial processes.<p>**Company-Level Issue Examples** *- Digital Divide, ESG integration in financial services, Engineering Structural Integrity.*| |**GOAL10REDUCEDINEQUALITIES**|**Reduced Inequalities** - Goal 10 calls for reducing inequalities in income as well as those based on age, sex, disability, race, ethnicity, origin, religion, or economic or other status within a country. The Goal addresses inequalities among countries, including those related to representation, migration, and development assistance. It aims to empower and promote social, economic, and political inclusion of all. The Goal stresses regulation and monitoring of global financial markets and institutions.<p>**Company-Level Issue Examples** *- Responsible Lending, Worker Discrimination, CEO Pay Gap, Worker Pay Gap, Workplace Diversity and Inclusion.*| |**GOAL11SUSTAINABLECITIESANDCOMMUNITIES**|**Sustainable Cities and Communities** - Goal 11 seeks to ensure access for all to adequate, safe, and affordable housing and basic services, and green and public spaces, and to upgrade slums. It focuses on improving transportation, air quality and municipal and other waste management, and creating inclusive and sustainable urbanization through participatory urban planning. The Goal also supports safeguarding the world's cultural and natural heritage, while aiming to increase the number of cities and human settlements adopting and implementing integrated policies and plans towards inclusion, resource efficiency, mitigation and adaptation to climate change, and resilience to disasters.<p>**Company-Level Issue Examples** *- Air Pollution, Environmental Justice, Human Rights Violations, Affordable Housing.*| |**GOAL12RESPONSIBLECONSUMPTIONANDPRODUCTION**|**Responsible Consumption and Production** - Goal 12 aims to achieve the sustainable management and efficient use of natural resources through both the public and private sector. It specifically addresses global food waste in consumption, production, and distribution, sustainable tourism, waste and chemicals management. Goal 12 encourages sustainability reporting in the private sector, while in the public sector it encourages restructuring taxation and subsidies for fossil fuels and promoting sustainable public procurement practices.<p>**Company-Level Issue Examples** *- Sustainability Reporting, Circular Economy, Hazardous Waste Management, Waste Reduction.*| |**GOAL13CLIMATEACTION**|**Climate Action** - While Goal 13 is focused on actions by countries towards climate mitigation and adaptation, the private sector can also play a role in these areas. The goal seeks to strengthen resilience and adaptive capacity to climate-related hazards and natural disasters in all countries. It calls for integrating climate change measures, including those related to climate resilience and low GHG development, into national policies, strategies, and planning. It aims to improve education and awareness of climate change mitigation, adaptation, impact reduction, and early warning.<p>**Company-Level Issue Examples** *- GHG Emissions, Sustainable Transportation, Physical Climate Impacts.*| |**GOAL14LIFEBELOWWATER**|**Life Below Water** - Goal 14 focuses on preventing marine pollution of all kinds, particularly from land-based activities, and to minimize and address the impacts of ocean acidification. The Goal also aims to achieve sustainable yields in fisheries, through regulation of harvesting, controlling subsidies, and ending overfishing. It seeks to sustainably manage and protect marine and coastal ecosystems to avoid significant adverse impacts, including by strengthening their resilience, and take action for their restoration in order to achieve healthy and productive oceans.<p>**Company-Level Issue Examples** *- Impacts on water-related endangered species and habitats, Oil Spills, Seafood Sourcing.*| |**GOAL15LIFEONLAND**|**Life On Land** - Goal 15 seeks to ensure the conservation, restoration, and sustainable use of terrestrial and inland freshwater ecosystems and their services, in order to preserve biodiversity. It focuses specifically on sustainably managing forests, halting deforestation, restoring degraded lands and successfully combating desertification, reducing degraded natural habitats and ending biodiversity loss, with an emphasis on threatened species and invasive alien species.<p>**Company-Level Issue Examples** *- Impacts on land-related endangered species and habitats, Sustainable forestry practices and certifications, Project lifecycle environmental impacts.*| |**GOAL16PEACEJUSTICEANDSTRONGINSTITUTIONS**|**Peace, Justice, and Strong Institutions** - Goal 16 aims to significantly reduce all forms of violence, and also focuses specifically on reducing violence against children in the forms of abuse, exploitation, trafficking, and torture. It also aims to significantly reduce illicit financial and arms flows and to substantially reduce corruption and bribery in all their forms. The Goal also emphasizes effective and transparent institutions at all levels, inclusive and participatory decision-making, ensuring public access to information, and protection of fundamental freedoms.<p>**Company-Level Issue Examples** *- Tax Avoidance, Anti-Competitive Behavior, Cyber Security, Corruption, ESG Resolutions.*| 
 * @member {Array.<String>} categories
 */
SdgArticlesRequest.prototype['categories'] = undefined;

/**
 * Request available Articles data fields to be included in the response.  Default is all fields. _fsymId_ and _articleId_ are always included.    <h3>Common Fields</h3>    |field|description|   |---|---|   |fsymId|Factset Regional Security Identifier|   |articleId|Unique ID of the article assigned by Truvalue|               <h3> Articles Fields</h3>     |field|description|   |---|---|   |datePub|Publication date of the article expressed in YYYY-MM-DD format|   |title|Title of the article|   |source|Source of the article|   |categories|categories assigned by Truvalue|   |bullets|AI-generated bullet point summary for each article. Note, including bullets increases response size drastically|   |author|Author of the article|   |url|URL of the article|   |language|Language code of the article|   |orgName| Organization name assigned by Truvalue|   |orgId| Unique identifier assigned by Truvalue that is applied on an organization level    
 * @member {Array.<String>} fields
 */
SdgArticlesRequest.prototype['fields'] = undefined;

/**
 * The start date requested for a given date range in YYYY-MM-DD format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} startDate
 */
SdgArticlesRequest.prototype['startDate'] = undefined;

/**
 * The end date requested for a given date range in YYYY-MM-DD format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} endDate
 */
SdgArticlesRequest.prototype['endDate'] = undefined;

/**
 * @member {module:model/DateOf} dateOf
 */
SdgArticlesRequest.prototype['dateOf'] = undefined;






export default SdgArticlesRequest;

