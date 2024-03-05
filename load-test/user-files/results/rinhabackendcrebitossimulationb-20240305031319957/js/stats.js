var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name--1146707516",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "16",
        "ok": "15",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "5",
        "ok": "41",
        "ko": "5"
    },
    "maxResponseTime": {
        "total": "44",
        "ok": "44",
        "ko": "5"
    },
    "meanResponseTime": {
        "total": "40",
        "ok": "42",
        "ko": "5"
    },
    "standardDeviation": {
        "total": "9",
        "ok": "1",
        "ko": "0"
    },
    "percentiles1": {
        "total": "42",
        "ok": "42",
        "ko": "5"
    },
    "percentiles2": {
        "total": "43",
        "ok": "43",
        "ko": "5"
    },
    "percentiles3": {
        "total": "44",
        "ok": "44",
        "ko": "5"
    },
    "percentiles4": {
        "total": "44",
        "ok": "44",
        "ko": "5"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 15,
    "percentage": 94
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 1,
    "percentage": 6
},
    "meanNumberOfRequestsPerSecond": {
        "total": "8",
        "ok": "7.5",
        "ko": "0.5"
    }
},
contents: {
"req_validac-o-es--40002687": {
        type: "REQUEST",
        name: "validações",
path: "validações",
pathFormatted: "req_validac-o-es--40002687",
stats: {
    "name": "validações",
    "numberOfRequests": {
        "total": "16",
        "ok": "15",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "5",
        "ok": "41",
        "ko": "5"
    },
    "maxResponseTime": {
        "total": "44",
        "ok": "44",
        "ko": "5"
    },
    "meanResponseTime": {
        "total": "40",
        "ok": "42",
        "ko": "5"
    },
    "standardDeviation": {
        "total": "9",
        "ok": "1",
        "ko": "0"
    },
    "percentiles1": {
        "total": "42",
        "ok": "42",
        "ko": "5"
    },
    "percentiles2": {
        "total": "43",
        "ok": "43",
        "ko": "5"
    },
    "percentiles3": {
        "total": "44",
        "ok": "44",
        "ko": "5"
    },
    "percentiles4": {
        "total": "44",
        "ok": "44",
        "ko": "5"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 15,
    "percentage": 94
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 1,
    "percentage": 6
},
    "meanNumberOfRequestsPerSecond": {
        "total": "8",
        "ok": "7.5",
        "ko": "0.5"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
