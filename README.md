# Topcoder-trains-advance
 Topcoder : Train Manager Advance
 
 
## Memasukkan Data Dummy

Request POST ke ```localhost:8080/api/trains``` dengan data raw dalam format JSON :

```json
[
  {
    "id": 1,
    "name": "Light rail",
    "description": "Light rail, which might be also known as trolley and streetcars, mean trains that function as local transit in an urban-core and can operate on the street-level. Compared to rapid transit, light rail costs less, is more pedestrian friendly, but has less passenger capacity. The major advantage with light rail is that it can operate like rapid transit or like local buses, depending on the available infrastructure",
    "distanceBetweenStop": "a few blocks to 1 or 2 miles",
    "maxSpeed": "55-65 mph",
    "sharingTracks": true,
    "gradeCrossing": false,
    "trainFrequency": "3-30 minutes",
    "amenities": "n/a"
  },
  {
    "id": 2,
    "name": "Rapid transit",
    "description": "Rapid transit, which is also known as metro, subway, and heavy rail, mean trains that generally serve the urban-core, have large passenger capacity, and operate totally separate from road traffic. In order to run separately from road traffic in the city-core, rapid transit trains would run either above or underground.",
    "distanceBetweenStop": "1/2 mile to 2 or 3 miles",
    "maxSpeed": "65-70 mph",
    "sharingTracks": false,
    "gradeCrossing": false,
    "trainFrequency": "3-20 minutes",
    "amenities": "Large space for standees"
  },
  {
    "id": 3,
    "name": "Commuter rail",
    "description": "Commuter trains generally mean trains connecting suburban areas with the central city and primarily serves riders to and from work. Commuter trains typically run on weekdays, during rush hours, and only in the peak directions.",
    "distanceBetweenStop": "1 to 2 miles",
    "maxSpeed": "79 mph",
    "sharingTracks": true,
    "gradeCrossing": true,
    "trainFrequency": "15 minutes to hourly (some operate only during weekday peak hours)",
    "amenities": "Restroom"
  },
  {
    "id": 4,
    "name": "Inter-city rail",
    "description": "Inter-city trains generally mean trains traveling long distances connecting metropolitan areas. Although the distances covered by some of these trains are comparable to airlines, inter-city trains generally operate at highway speed. Long distance inter-city trains may provide amenities not found on most other forms of transportation, including sleeper-cars and cafe/dining cars.",
    "distanceBetweenStop": "2 to 10 miles",
    "maxSpeed": "79 mph",
    "sharingTracks": true,
    "gradeCrossing": true,
    "trainFrequency": "Hourly to once a day, or even three trips a week.",
    "amenities": "Restroom, business class, sleeper (longer distance), cafe car, dining car"
  },
  {
    "id": 5,
    "name": "High speed rail",
    "description": "High speed trains are generally defined as trains that can operate 125mph or faster. High speed trains generally connect large metropolitan areas (with very few stops in between) and are meant to be competitive with airlines in terms of overall travel time.",
    "distanceBetweenStop": "at least 10 miles",
    "maxSpeed": "at least 90 mph",
    "sharingTracks": false,
    "gradeCrossing": false,
    "trainFrequency": "15 minutes to hourly",
    "amenities": "Restroom, business class, cafe car"
  },
  {
    "id": 6,
    "name": "Eurostar e320",
    "description": "Eurostar e320 was created as a single and unified corporate entity owned by SNCF, SNCB and LCR in September 2010. In December, a £700m (approximately $1,076bn) investment to add ten new e320 trains to its fleet and carry out a complete upgrade of its existing 28 trains. It is capable of carrying more than 900 passengers as a result of the 20% capacity boost given to it, compared to the existing 28 Eurostar trains which carry 750 passengers. The entire propulsion system and technical modules are distributed under the floor over the entire length of the train, providing more space for passengers. The train’s roof is equipped with eight pantographs for dealing with Europe’s different power systems and contact line types.",
    "amenities": "Restroom, business class, cafe car, Wi-Fi, Onboard flat-screens. Reclining seats, flexible reading lamp, a sliding dining table and more luggage areas. Four spaces are provided for wheelchair passengers.",
    "distanceBetweenStop": "at least 200 miles",
    "maxSpeed": "200 mph",
    "sharingTracks": false,
    "gradeCrossing": false,
    "trainFrequency": "12 hours"
  },
  {
    "id": 7,
    "name": "L0 Series Maglev",
    "description": "This Japanese train, which is currently being developed and tested by the Central Japan Railway Company (JR Central), holds the land speed record for rail vehicles, clocking in at 374 mph. The L0 Series technology, called maglev (magnetic levitation train), actually makes the train levitate at speeds exceeding around 93 mph. The technology is currently being employed worldwide (see see number four), and there are talks of it being used for a train between Washington, D.C. and Baltimore.",
    "amenities": "Restroom, business class, cafe car, Wi-Fi, Onboard flat-screens. Reclining seats, flexible reading lamp.",
    "distanceBetweenStop": "at least 100 miles",
    "maxSpeed": "374 mph",
    "sharingTracks": false,
    "gradeCrossing": false,
    "trainFrequency": "6 hours"
  },
  {
    "id": 8,
    "name": "TGV POS",
    "description": "France has had high-speed rail travel dialed in for many years. And in 2007, the TGV POS set the world speed record for rail vehicles at an impressive 357 mph, before being surpassed by Japan's L0 Series in 2015. The train is operated by French rail company SNCF for use on the LGV Est route, which runs between Paris, eastern France, and southern Germany. While in regular service, the train reaches a top speed of 200 mph. It's not 357 mph, but it's still shockingly fast.",
    "amenities": "Wi-Fi, Restroom, Onboard flat-screens. Reclining seats, flexible reading lamp, a sliding dining table.",
    "distanceBetweenStop": "at least 150 miles",
    "maxSpeed": "357 mph",
    "sharingTracks": false,
    "gradeCrossing": false,
    "trainFrequency": "7 hours"
  },
  {
    "id": 9,
    "name": "CRH380A Hexie",
    "description": "While China's CRH380A Hexie (also called Harmony) can cruise at a maximum speed of 236 mph for commercial operations, it reached a whopping 302 mph during testing. And what's even more impressive is that the high-speed electric train is just one of four Chinese train series developed to operate on the newly constructed high-speed main lines. The CRH380A may be the fastest, but the other three are nothing to scoff at — check out the CRH380B, CRH380C, and CRH380D.",
    "amenities": "Restroom, business class, Wi-Fi, Onboard flat-screens. Reclining seats, flexible reading lamp, dining table",
    "distanceBetweenStop": "at least 100 miles",
    "maxSpeed": "302 mph",
    "sharingTracks": false,
    "gradeCrossing": false,
    "trainFrequency": "5 hours"
  },
  {
    "id": 10,
    "name": "Shanghai Maglev",
    "description": "Similar to Japan's L0 Series, the Shanghai maglev (also called the Shanghai Transrapid) is a magnetic levitation train that operates out of Shanghai, China. And while it lands solidly at number four on this list, thanks to a top speed of 268 mph, it's actually the oldest commercial maglev train still in operation. If you fly into Shanghai Pudong International Airport, riding this train is easy. You can hop off in central Shanghai or take it all the way to the outskirts of central Pudong, where the line ends.",
    "amenities": "Wi-Fi, Restroom, business class, cafe car, Wi-Fi, Onboard flat-screens. Flexible reading lamp, a sliding dining table and more luggage areas.",
    "distanceBetweenStop": "at least 100 miles",
    "maxSpeed": "268 mph",
    "sharingTracks": false,
    "gradeCrossing": false,
    "trainFrequency": "4 hours"
  }
]

```
